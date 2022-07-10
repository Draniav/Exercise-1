package VetPet;

import VetPet.Inventory.Inventory;
import VetPet.Inventory.Inventory_Control;
import VetPet.Schedule.Schedule;
import VetPet.Schedule.Schedule_Control;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Inventory_Control IC = new Inventory_Control();
        Schedule_Control SC = new Schedule_Control();
        ArrayList<Inventory> MyInventoryList = new ArrayList<>();
        ArrayList<Schedule> MyScheduleList = new ArrayList<>();
        IC.upLoadInventaryList(MyInventoryList);
        SC.upLoadScheduleList(MyScheduleList);
        boolean bandera = false;

        System.out.println("Welcome to VetPet's App");
        Messages.menuMain();

        Scanner sc = new Scanner(System.in);
        System.out.println("witch menu do u want?");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                int opt = 1;
                while (opt == 1){
                Messages.menuInventory();
                System.out.println("witch menu do u want?");
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        IC.addInventory(MyInventoryList);
                        break;
                    case 2:
                        IC.showInventory(MyInventoryList);
                        break;
                    case 3:
                        //Edit
                       // IC.Inventory(MyInventoryList);
                        break;
                    case 4:

                        IC.deleteItemInventory(MyInventoryList);
                        break;
                    case 0:

                        System.exit(0);
                        break;

                    default:
                        System.out.println("ERROR, only  type numbers between 0 y 4");
                        break;

                }
            }

            case 2:
                Messages.menuSchedule();
                opt = 1;
                while (opt == 1){
                    Messages.menuInventory();
                    System.out.println("witch menu do u want?");
                    menu = sc.nextInt();
                    switch (menu) {
                        case 1:
                            SC.addSchedule(MyScheduleList);
                            break;
                        case 2:
                            SC.showSchedule(MyScheduleList);
                            break;
                        case 3:
                            //Edit
                           // SC.addSchedule(MyScheduleList);
                            break;
                        case 4:

                            SC.deleteSchedule(MyScheduleList);
                            break;
                        case 0:

                            System.exit(0);
                            break;

                        default:
                            System.out.println("ERROR, only  type numbers between 0 y 4");
                            break;

                    }
                }



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
                System.out.println("ERROR, only  type numbers between 0 y 4");

                break;
        }


    }

}