package com.company;

// NOTE: No SQL needed, your ArrayList is your "database"

// import for Scanner class
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ArrayList for AddressBook ("contacts") into
        ArrayList<AddressBook> contacts = new ArrayList<>();

        boolean loopTrue = true; // boolean var for controlling the while (program) loop

        while(loopTrue) {
            // Starting Program Prompt
            System.out.print("1) Add an entry\n\n" + "2) Remove an entry\n\n" +
                    "3) Search for a specific entry\n\n" + "4) Print Address Book\n\n" +
                    "5) Delete Book\n\n" + "6) Quit\n\n\n" +
                    "Please choose what you'd like to do with the database:\n");

            // scanner for user input
            Scanner scan = new Scanner(System.in);

            // user input here; variable for holding the user's program choice on startup
            int userAction = scan.nextInt();
            scan.nextLine();

            // TODO class "reference" come in here. Implement.
            /* TODO What class names should we use? Choose.
             *   EntryAdd - 1) Add an entry
             *   EntryRemove - 2) Remove an entry
             *   EntrySearch - 3) Search for a specific entry
             *   BookPrintAddress - 4) Print Address Book
             *   BookDelete - 5) Delete Book
             *   Quit - 6) Quit
             */

            //user input options
            switch (userAction) {
                case 1:
                    AddressBook contactNew = new AddressBook();
                    System.out.println("Enter a first name:");
                    contactNew.setFirstName(scan.nextLine());
                    System.out.println("Enter a last name:");
                    contactNew.setLastName(scan.nextLine());
                    System.out.println("Enter a phone number:");
                    contactNew.setPhoneNumber(scan.nextLine());
                    System.out.println("Enter an email address:");
                    contactNew.setUserEmail(scan.nextLine());
                    // format output
                    System.out.println("\n");
                    contactNew.getAllInfo();
                    // adding the new contact to the array of contacts
                    contacts.add(contactNew);
                    break;
                case 2:
                    System.out.println("Choose which contact you'd like to erase:");
                    int userActionRemove = scan.nextInt();
                    AddressBook book1 = contacts.get(userActionRemove);
                    book1.getAllInfo();
                    scan.nextLine();
                    contacts.remove(userActionRemove);
                    System.out.println("\nContact " + userActionRemove + " removed");
                    break;
                case 3:
                    System.out.println("Haha");
                    break;
                case 4:
                    System.out.println("\n");
                    for (AddressBook i: contacts) {
                        i.getAllInfo();
                        System.out.println("\n");
                    } // "i" is an iterator
                    break;
                case 5:
                    System.out.println("\n");
                    for (int i = 0; i < contacts.size(); i++) {
                        contacts.remove(i);
                    } // "i" is an iterator
                    break;
                case 6:
                    System.out.println("Program exited");
                    loopTrue = false;
                    break;
                default:
                    System.out.println("You didn't put anything, stupid");
                    break;
            }

            /* TODO: implement command line program loop (while?)
             *  i.e. After the entry has been added, show the main menu again to take in a new input.
             */
        }

    }
}
