package MP2.controller;
import MP2.model.*;

public class LoanController
{
    private LoanContainer loancontainer;
    private Friend friend;
    public LoanController()
    {
        loancontainer = loancontainer.getInstance();
    }

    public void createLoan(String loanNumber, String borrowDate, String returnDate, boolean status){
        Loan loan = new Loan(loanNumber,borrowDate,returnDate,status);
        loancontainer.addLoan(loan);
    }

    public Friend addFriend(int phone){
        Friend friend = new Friend(phone);

        return friend;
    }
}
