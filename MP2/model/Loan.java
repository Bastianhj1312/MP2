package MP2.model;

public class Loan
{
    private Friend f;
    private LPCopy l;
    private Loan loan;
    private int loanNumber;
    private String borrowDate;
    private String returnDate;
    private boolean status;

    
    public Loan(Friend f, LPCopy l, int loanNumber, String borrowDate, String returnDate, boolean status)
    {
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
        this.f = f;
        this.l = l;
    }

    public Loan add() {
        return loan;
    }

    private Friend getFriend() {
        return f;
    }

    private LPCopy getLP() {
        return l;
    }

}
