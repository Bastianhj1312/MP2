package MP2.tui;
import java.util.Scanner;
import MP2.controller.*;
import MP2.model.*;

/**
 * Write a description of class MainMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class MainMenu {
    // instance variables 
    private LoanMenu loanMenu;
    private LoanController lc;
    private Loan loan;
    

    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu() {
        // initialise instance variables
        loanMenu = new LoanMenu();
        lc = new LoanController();
        
       
    }
    
    public void start() {
        mainMenu();
    }
    
    private void mainMenu() {
        boolean running = true;
        while (running) {
            int choice = writeMainMenu();
            switch (choice) {
                case 1:
                 createPhone();
                  break;
                case 2:
                  createLoan();
                  break;
                case 3:
                  loanMenu.start();
                  break;
                case 0:
                  System.out.println("Tak for denne gang.");
                  running = false;
                  break;
                default:
                  System.out.println("Der er sket en uforklarlig fejl, choice = "+choice);
                  break;
            }
        }
    }

    private int writeMainMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Hovedmenu ******");
        System.out.println(" (1) Lånermenu");
        System.out.println(" (2) LP menu");
        System.out.println(" (3) Udlånsmenu");
        System.out.println(" (0) Afslut programmet");
        System.out.print("\n Vælg:");
        
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
   
    private void createTestData(){
        //getInstance
        //create some Friends and LPs
        
    }
    
    private int inputLoanNumber() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast int Loan Number: ");
        int loanNumber = keyboard.nextInt();
        return loanNumber;
    }
    private String inputBorrowDate() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast Borrow Date: ");
        String borrowDate = keyboard.nextLine();
        return borrowDate;
    }
    private String inputReturnDate() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast Return Date: ");
        String returnDate = keyboard.nextLine();
        return returnDate;
    }
    private boolean inputStatus() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast Status: ");
        boolean status = keyboard.nextBoolean();
        return status;
    }
    
    private void createLoan() {
       int loanNumber = inputLoanNumber();
       String borrowDate = inputBorrowDate();
       String returnDate = inputReturnDate();
       boolean status = inputStatus();
       lc.createLoan(loanNumber, borrowDate, returnDate, status);
    }
    
    
    private int inputPhone() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast Telefon Nummer: ");
        int phone = keyboard.nextInt();
        return phone;
    }
    
    private void createPhone() {
        int phone = inputPhone();
        lc.addFriend(phone);
    }
    
    }
