package MP2.model;
import java.util.ArrayList;

public class LoanContainer
{
    private ArrayList<Loan> loaners;
    private static LoanContainer instance;
    private int nextNo;

    private LoanContainer()
    {
        loaners = new ArrayList<>();
        nextNo = 1;
    }

    public static LoanContainer getInstance(){
        if(instance == null) {
            instance = new LoanContainer();
        }

        return instance;
    } 

    public boolean addLoan(Loan loan) {
        Loan conflict = findLoan(loan.getLoanNumber());
        boolean loanres = false;
        if (conflict == null) {
            loaners.add(loan);
            loan.setLoanNumber(nextNo);
            nextNo++;
            loanres = true;
        }
        return loanres;

    }

    public ArrayList<Loan> getAllLoans(){
        return new ArrayList<>(loaners);
    }

    public Loan findLoan(int loanNumber) {
        for (Loan loan : loaners) {
            if (loan.getLoanNumber() == loanNumber) {
                return loan;
            }
        }
        return null;
    }
}

