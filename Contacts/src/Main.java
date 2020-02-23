import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactList newList = new ContactList();
        int userPressed = 0;
        String option;
        boolean bye = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Welcome to Rakesh's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            try {
                userPressed = scan.nextInt();
            } catch (Exception e) {
                System.out.println("An Error occurred " + e);
            }

            switch (userPressed) {
                case 1:
                    System.out.println("You have chosen to add a new contact: \n" +
                            "Please enter the name of the Person");
                    String firstName, lastName, contactNumber, anotherNumber, EmailId;

                    System.out.print("First Name: ");
                    firstName = scan.next();
                    System.out.print("Last Name: ");
                    lastName = scan.next();
                    System.out.print("Contact Number: ");
                    contactNumber = scan.next();
                    System.out.print("Would you like to add another contact number? (y/n): ");
                    option = scan.next();
                    if (option.equalsIgnoreCase("y")) {
                        System.out.print("Contact Number: ");
                        anotherNumber = scan.next();
                    } else anotherNumber = null;
                    System.out.print("Would you like to add email address? (y/n): ");
                    option = scan.next();
                    if (option.equalsIgnoreCase("y")) {
                        System.out.print("Email Address: ");
                        EmailId = scan.next();
                    } else EmailId = null;
                    System.out.println("\n");
                    newList.aaInContactList(firstName, lastName, contactNumber, anotherNumber, EmailId);
                    break;

                default:
                    System.out.println("Unknown Entry ..");

            }
        } while (!bye);
    }
}
