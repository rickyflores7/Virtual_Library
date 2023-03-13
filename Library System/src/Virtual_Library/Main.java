package Virtual_Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookDatabase database = BookDatabase.getInstance();
        Scanner scan = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("\t MDI Novare University");
        System.out.println("    Powered by : StackTrek");
        System.out.println("================================");
        System.out.println("\t  BE DIFFERENT BE US");
        System.out.println("================================");
        System.out.println("        VIRTUAL LIBRARY     ");

        do {
            try {
                System.out.println("================================");
                System.out.println("1 - Add Book");
                System.out.println("2 - Delete Book");
                System.out.println("3 - View Book");
                System.out.println("0 - Exit");
                System.out.println("================================");
                System.out.print("Input Number: ");
                int choice = Integer.parseInt(scan.nextLine());

                if (choice == 1) {
                    System.out.print("Enter book name: ");
                    database.addBook(scan.nextLine());
                } else if ( choice == 2) {
                    System.out.print("Enter Book ID: ");
                    database.removeBook(Integer.parseInt(scan.nextLine()));
                } else if ( choice == 3) {
                    database.viewBooks();
                } else if ( choice == 0) {
                    System.out.println("\nTerminating Application");
                    break;
                } else {
                    System.out.println("Invalid Number\n");
                }
            } catch (Exception e) {
                System.out.println("\nInvalid Input\n");
            }
        } while (true);
    }
}