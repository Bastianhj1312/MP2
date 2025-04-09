package MP2.model;

public class Loan
{
    private Loan loan;
    private String loanNumber;
    private String borrowDate;
    private String returnDate;
    private boolean status;

    
    public Loan(String loanNumber, String borrowDate, String returnDate, boolean status)
    {
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public Loan add() {
        return loan;
    }

}
