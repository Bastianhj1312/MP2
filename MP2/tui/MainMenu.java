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
                  createLP();
                  break;
                case 3:
                  createLoan();
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
        System.out.println(" (1) Friendmenu");
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
    
   private String inputLP() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Indtast Serial Nummer: ");
        String barcode = keyboard.nextLine();
        return barcode;
    }
    
    private void createLP() {
        String barcode = inputLP();
        lc.addLP(barcode);
    }
    
    private void createLoan() {
       int loanNumber = loanMenu.inputLoanNumber();
       String borrowDate = loanMenu.inputBorrowDate();
       String returnDate = loanMenu.inputReturnDate();
       boolean status = loanMenu.inputStatus();
       loan = lc.createLoan(loanNumber, borrowDate, returnDate, status);
    }
    
    }
