package com.company;

// NOTE: No SQL needed, your ArrayList is your "database"

// import for Scanner class
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<AddressBook> userBook = new ArrayList<AddressBook>();
        // ArrayList for data or whatever(????)
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
                System.out.println("sus");
                break;
            case 2:
                System.out.println("Schlatty Patty");
                break;
            case 3:
                System.out.println("Haha");
                break;
            case 4:
                System.out.println("kakak");
                break;
            case 5:
                System.out.println("abab");
                break;
            case 6:
                System.out.println("ggg");
            break;
            default:
                System.out.println("You didn't put anything, stupid");
        }

        /* TODO: implement command line program loop (while?)
        *  i.e. After the entry has been added, show the main menu again to take in a new input.
        */

    }
}
