package VetPet;


import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * This class is intended to create all contain all the messages that
 * will be used by the program and seen in the console.
 */
public class Messages {

    public static void failureMsg() {
        System.out.println("===========================================================");
        System.out.println("|   Error, the app can't read it,  please type it again   |");
        System.out.println("===========================================================");

    }


    /**
     * a method is created to create the menu to be displayed by the user
     */

    public static void returningMsg() {
        System.out.println("==========================================================");
        System.out.println("| The typed option is empty right now or was wrong typed |");
        System.out.println("==========================================================");
        System.out.println("|             Returning to main menu.                    |");
        System.out.println("==========================================================");
    }

    /**
     * a method created to show the menu to be displayed by the user.
     */

    public static void continueMsg() {
        System.out.println("=========================================================");
        System.out.println("|            Do  you  want to  continue                 |");
        System.out.println("=========================================================");
        System.out.println("|                     1- yes                            |");
        System.out.println("|                     2- no                             |");
        System.out.println("=========================================================");
    }

    /**
     * a method created to show the menu to be displayed by the user.
     */

    public static void menuLine() {
        System.out.println("==========================================================");
    }

    public static void menuMenu() {
        System.out.println("|               1- to Add.                               |");
        System.out.println("|               2- to See.                               |");
        System.out.println("|               3- to Edit.                              |");
        System.out.println("|               4- to Remove.                            |");
        System.out.println("|               5- to go  Back                           |");
        System.out.println("|               0- Exit program                          |");
        menuLine();
    }

    public static void menuMain() {
        menuLine();
        System.out.println("|           Hello Welcome to your SANIPETs'APP           |");
        menuLine();
        System.out.println("|   *          1- Menu Inventory                         |");
        System.out.println("|   * *        2- Menu Schedule                          |");
        System.out.println("|   *   *      3- Menu Doctors                           |");
        System.out.println("|   * *        4- Menu Patients                          |");
        System.out.println("|   *          0- Exit program                           |");
        System.out.println("|                                                        |");
        menuLine();
    }

    public static void menuInventory() {
        menuLine();
        System.out.println("|               Menu INVENTORY                           |");
        menuLine();
        menuMenu();
        menuLine();

    }

    public static void menuPatients() {
        menuLine();
        System.out.println("|               Menu PATIENT                             |");
        menuLine();
        menuMenu();
        menuLine();
    }

    public static void menuEmployees() {
        menuLine();
        System.out.println("|               Menu EMPLOYEE                            |");
        menuLine();
        menuMenu();
        menuLine();
    }

    public static void menuSchedule() {
        menuLine();
        System.out.println("|               Menu SCHEDULE                            |");
        menuLine();
        menuMenu();
        menuLine();
    }


    /**
     * This method controls my program output
     *
     * @param exit is the attribute we use to evaluate the continuity of the program.
     * @return
     */


    public static boolean menuContinue(boolean exit) {
        int a = 1;
        Scanner sn = new Scanner(System.in);
        while (a == 1) {
            try {
                continueMsg();
                a = sn.nextInt();
                switch (a) {
                    case 1:
                        a = 2;
                        exit = false;
                        break;
                    case 2:

                        System.out.println("   Thank you for using this app :) ");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Type only numbers please (1:to  continue. 2:to Finish");

                        a = 1;
                }
            } catch (InputMismatchException e) {
                a = 1;


                System.out.println("Type only numbers please (1:to  continue. 2:to Finish");
                sn.next();

            }
        }


        return false;

    }

    public static void table() {
        System.out.println("===================================================================================================================");
        System.out.println("|    ID    |  Name of the Medicine         |   Presentation   |     Usage     |     quantity     |      Stock     |");
        System.out.println("===================================================================================================================");


    }


}

