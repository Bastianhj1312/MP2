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

    public LP addLP(LPCopy lpcopy){
        LPController lpc = new LPController();
        LP lp = lpc.findLP(lpcopy);
        lpcopy.setSerialNumber(lp);
        
        return lp;
    }

    public Loan endLoan() {
         loancontainer.addLoan(loan);
         return loan;

    }
}
