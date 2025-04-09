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
    public void addLoan(Loan loan) {
        this.nextNo++;
        loaners.add(loan);
            
            
        }
    public ArrayList<Loan> getAllLoans(){
        return new ArrayList<>(loaners);
    }
    public Loan findLoan(String loanNumber) {
        for (Loan loan : loaners) {
            if (loan.getLoanNumber().equals(loanNumber)) {
                return loan;
            }
        }
        return null;
    }
    }
    

