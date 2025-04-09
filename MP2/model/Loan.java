package MP2.model;

public class Loan
{
    private Loan loan;
    private String loanNumber;
    private String borrowDate;
    private String returnDate;
    private boolean status;
    private Friend friend;
    private LPCopy lpcopy;

    
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
    
    public void setFriend(Friend friend){
        this.friend = friend;
    }
    
    public void setLPCopy(LPCopy lpcopy){
        this.lpcopy = lpcopy;
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
