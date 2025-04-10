package MP2.tui;
import java.util.Scanner;


/**
 * Write a description of class LoanMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class LoanMenu {
    // instance variables
    private Scanner scanner;

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
        // initialise instance variables

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
                    System.out.println(" Denne er ikke implementeret endnu!");
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

    public String inputBorrowDate(String prompt) {
        System.out.print(prompt + ": ");
        String res = scanner.nextLine();
        return res;
    }

    public int inputLoanNumber(String prompt) {
        System.out.print(prompt + ": ");
        int res = scanner.nextInt();
        scanner.nextLine();
        return res;
    }

    public String inputReturnDate(String prompt) {
        System.out.print(prompt + ": ");
        String res = scanner.nextLine();
        return res;
    }

    public boolean inputStatus(String prompt) {
        System.out.print(prompt + ": ");
        boolean res = scanner.nextBoolean();
        scanner.nextLine();
        return res;
    }
    
    public int inputPhone(String prompt) {
        System.out.print(prompt + ": ");
       int res = scanner.nextInt();
        scanner.nextLine();
        return res;
    }
}

