package VetPet;

import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to VetPet's App");
       Messages.menuMain();
    //    Messages.menuMenu();

        //input by  keyboard the option , the app reads in  the variable "menu"
        int menu = 1;

        switch(menu){
            case 1:
                Messages.menuInventory();
                break;
            case 2:
                Messages.menuSchedule();
                break;
            case 3:
                Messages.menuEmployees();
                break;
            case 4:
                Messages.menuPatients();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                break;
        }



    }

}