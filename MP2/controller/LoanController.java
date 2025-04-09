package MP2.controller;
import MP2.model.*;

public class LoanController
{
    private LoanContainer loancontainer;
    private FriendContainer friendcontainer;
    private LPContainer lpcontainer;
    public LoanController()
    {
    loancontainer = loancontainer.getInstance();
    friendcontainer = friendcontainer.getInstance();
    lpcontainer = lpcontainer.getInstance();
    }
    public void createLoan(String loanNumber, String borrowDate, String returnDate, boolean status){
        Loan loan = new Loan(loanNumber,borrowDate,returnDate,status);
        loancontainer.addLoan(loan);
    }
    public Friend addFriend(String name, int phone, String address, int postalcode, String city){
        Friend friend = new Friend(name,phone,address,postalcode,city);
        friendcontainer.addFriend(friend);
        return friend;
    }
    public LP addLP(String barcode, String title, String artist, String publicationDate, LPCopy lpcopy){
        LP lp = new LP(barcode,title,artist,publicationDate,lpcopy);
        lpcontainer.addLP(lp);
        return lp;
    }
    public Loan endLoan(String loanNumber) {
    Loan loan = loancontainer.findLoan(loanNumber);
    if (loan != null) {
        loan.setStatus(true); // Mark as returned
        return loan;
    } else {
        System.out.println("Kan ikke finde lånet");
        return null;
    }
}
}
