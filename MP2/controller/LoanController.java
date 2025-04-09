package MP2.controller;
import MP2.model.*;

public class LoanController
{
    private LoanContainer loancontainer;
    private FriendContainer friendcontainer;
    private LPContainer lpcontainer;
    private Loan loan;
    private LP lp;
    private LPCopy lpcopy;
    
    public LoanController()
    {
        loancontainer = loancontainer.getInstance();
        friendcontainer = friendcontainer.getInstance();
        lpcontainer = lpcontainer.getInstance();
    }

    public void createLoan(String loanNumber, String borrowDate, String returnDate, boolean status){
        loan = new Loan(loanNumber,borrowDate,returnDate,status);

    }

    public Friend addFriend(int phone){
        FriendController fc = new FriendController();
        Friend friend = fc.findFriend(phone);
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
