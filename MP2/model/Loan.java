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
     public String getLoanNumber() {
        return loanNumber;
    }
    public boolean getStatus() {
        return status;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
