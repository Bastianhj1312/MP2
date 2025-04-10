package MP2.controller;
import MP2.model.*;

public class LoanController
{
    private LoanContainer loancontainer;
    private FriendContainer friendcontainer;
    private LPContainer lpcontainer;
    private Friend friend;
    private Loan loan;
    private LP lp;
    private LPCopy lpcopy;

    public LoanController()
    {
        loancontainer = loancontainer.getInstance();
        friendcontainer = friendcontainer.getInstance();
        lpcontainer = lpcontainer.getInstance();
    }

    public Loan createLoan(int loanNumber, String borrowDate, String returnDate, boolean status){
        loan = new Loan(loanNumber, borrowDate, returnDate, status);
        
        return loan;
    }

    public Friend addFriend(int phone){
       FriendController fpc = new FriendController();
        Friend friend = fpc.findFriend(phone);
        loan.setFriend(friend);
        return friend;
    }

    public LPCopy addLPCopy(int serialNumber){
        LPController lpc = new LPController();
        LPCopy copy = lpc.findLPCopy(serialNumber);
        loan.setLPCopy(copy);
        return copy;
    }

    public Loan endLoan() {
        loancontainer.addLoan(loan);
        return loan;

    }
}
