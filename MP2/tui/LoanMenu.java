package MP2.tui;
import java.util.Scanner;
import MP2.controller.*;
import MP2.model.*;

/**
 * Write a description of class LoanMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class LoanMenu {
    // instance variables
    private Scanner scanner;
    private LoanController lc;
    private Loan loan;

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
       lc = new LoanController();

    }
    public void start() {
        loanMenu();
    }

    private void loanMenu() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            switch (choice) {
                case 1:
                    System.out.println("En uforklarlig fejl er sket med choice = " + choice);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("En uforklarlig fejl er sket med choice = " + choice);
                    break;
            }
        }
    }

    private int writeLoanMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Udlånsmenu ******");
        System.out.println(" (1) Opret lån");
        System.out.println(" (0) Tilbage");
        System.out.print("\n Vælg:");
        int choice = getIntegerFromUser(keyboard);
        return choice;
    }

    private int getIntegerFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }

     public int inputLoanNumber() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast int Loan Number: ");
        int loanNumber = keyboard.nextInt();
        return loanNumber;
    }
    
     public String inputBorrowDate() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast Borrow Date: ");
        String borrowDate = keyboard.nextLine();
        return borrowDate;
    }
    
     public String inputReturnDate() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast Return Date: ");
        String returnDate = keyboard.nextLine();
        return returnDate;
    }
    
     public boolean inputStatus() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast Status: ");
        boolean status = keyboard.nextBoolean();
        return status;
    }
    

    
}

