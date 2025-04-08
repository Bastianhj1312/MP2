package MP2.model;

public class Loan
{
    private FriendContainer fc;
    private LPContainer lpc;
    private Loan loan;
    private int loanNumber;
    private String borrowDate;
    private String returnDate;
    private boolean status;

    
    public Loan(int loanNumber, String borrowDate, String returnDate, boolean status)
    {
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public Loan add() {
        return loan;
    }

    private FriendContainer getFriend() {
        return fc;
    }

    private LPContainer getLP() {
        return lpc;
    }

}
