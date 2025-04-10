package MP2.model;
import java.util.Scanner;

public class Loan
{
    private Loan loan;   
    private int loanNumber;
    private String borrowDate;
    private String returnDate;
    private boolean status;
    private Friend friend;
    private LPCopy lpcopy;

    private Scanner scanner;
    
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
    
    public void setFriend(Friend friend){
        this.friend = friend;
    }
    
    public void setLPCopy(LPCopy lpcopy){
        this.lpcopy = lpcopy;
    }
    
    
    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;  // Set the provided value
    }

    // Getter and Setter for loanNumber
    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;  // Set the provided value
    }

    // Getter and Setter for returnDate
    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;  // Set the provided value
    }

    // Getter and Setter for status
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;  // Set the provided value
    }
}
