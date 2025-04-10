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

    public Friend addFriend(int phone) {
        // Ensure loan is initialized before trying to add a friend
        if (loan == null) {
            System.out.println("Error: Loan has not been created.");
            return null;
        }

        Friend friend = friendcontainer.findPhone(phone);
        if (friend != null) {
            loan.setFriend(friend);  // Set the friend for the loan
        }
        return friend; // Return the found friend or null if not found
    }

    public LP addLP(String barcode){
        LPController lpc = new LPController();
        LP lp = lpc.findLP(barcode);
        loan.setLP(lp);
        return lp;
    }

    
}
