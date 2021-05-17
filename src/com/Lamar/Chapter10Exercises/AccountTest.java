/*********************************************************************************
 * (Game: ATM machine) Use the Account class created in Programming Exercise      *
 * 9.7 to simulate an ATM machine. Create ten accounts in an array with id        *
 * 0, 1, . . . , 9, and initial balance $100. The system prompts the user to      *
 * enter an id. If the id is entered incorrectly, ask the user to enter a correct *
 * id. Once an id is accepted, the main menu is displayed as shown in the sample  *
 * run. You can enter a choice 1 for viewing the current balance, 2 for           *
 * withdrawing money, 3 for depositing money, and 4 for exiting the main menu.    *
 * Once you exit, the system will prompt for an id again. Thus, once the system   *
 * starts, it will not stop.                                                      *
 *********************************************************************************/

package com.Lamar.Chapter10Exercises;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
//        Create a scanner
        Scanner input = new Scanner(System.in);

//        Create ten accounts in an array
        Account[] accounts = new Account[10];

//        Initialize accounts
        initialBalance(accounts);

        do {
            System.out.println("Enter an id ");
            int id = input.nextInt();

            if (isValidID(id, accounts)) {
                int choice;
                do {
//                    get user choice
                    choice = displayMainMenu(input);
                    if (isTransaction(choice)) {
                        executeTransaction(choice, accounts, id, input);
                    }
                } while (choice ! = 4)
            }
//            once you exit, the system will prompt for an id again
        } while (true);
    }

//    Initialize accounts with balance of 100








    }


}
