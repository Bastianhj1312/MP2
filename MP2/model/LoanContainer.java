package MP2.model;
import java.util.ArrayList;

public class LoanContainer
{
    private ArrayList<Loan> loaners;
    private static LoanContainer instance;
    private int nextNo;

    
    public static LoanContainer getInstance(){
        if(instance == null) {
            instance = new LoanContainer();
        }

        return instance;
    }

    private LoanContainer()
    {
        loaners = new ArrayList<>();
        nextNo = 1;
    }
    
    public void addLoan(Loan loan) {
            loaners.add(loan);
            nextNo++;
            
        }

    }
    

