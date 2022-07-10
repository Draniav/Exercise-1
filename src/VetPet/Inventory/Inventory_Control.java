package VetPet.Inventory;

import VetPet.Messages;

import java.util.ArrayList;
import java.util.Scanner;

/*
This class contains the 'stock' of the store as mentioned in the exercise we will handle
Three types of medicines: Pills, Syrups and Pet-care, witch is an ArrayList that will contain
the information and will be used as our 'database'
*/
public class Inventory_Control {

    public ArrayList upLoadInventaryList(ArrayList<Inventory> myInventoryList) {

        myInventoryList.add(new Inventory(0, "Aspirin      ", "Pill", "Medical", 8, 3));
        myInventoryList.add(new Inventory(0, "ibuprofen      ", "Pill", "Medical", 5, 2));
        myInventoryList.add(new Inventory(0, "Naproxen      ", "Pill", "Medical", 8, 4));

        myInventoryList.add(new Inventory(0, "Hydrolysed collagen      ", "Syrup", "Aesthetic", 14000, 1));
        myInventoryList.add(new Inventory(0, "Glucosamine sulfate       ", "Syrup", "Aesthetic", 4000, 5));
        myInventoryList.add(new Inventory(0, "Chondroitin sulfate       ", "Syrup", "Aesthetic", 2400, 5));

        myInventoryList.add(new Inventory(0, "omega-3       ", "Pet-care", "Veterinary", 30, 8));
        myInventoryList.add(new Inventory(0, "Greyhound      ", "Pet-care", "Veterinary", 10, 10));
        myInventoryList.add(new Inventory(0, "Neoplex      ", "Pet-care", "Veterinary", 5, 1));


        /**
         * Scrolls through the items in stock and changes the
         * ids to these in order to be used by the other methods.
         */

        for (int i = 0; i < myInventoryList.size(); i++) {
            myInventoryList.get(i).setId(i + 1);

        }

        return myInventoryList;

    }

    /**
     * Show items
     */
    public ArrayList showInventory(ArrayList<Inventory> myInventoryList) {


        Messages.table();

        for (int i = 0; i < myInventoryList.size(); i++) {
            System.out.println(myInventoryList.get(i));
        }
        System.out.println("===========================================================================================================================================================");
        return myInventoryList;
    }


    public ArrayList deleteItemInventory(ArrayList<Inventory> myInventoryList) {
        int i = 0;
        Scanner sn = new Scanner(System.in);
        i = sn.nextInt();

        showInventory(myInventoryList);
        System.out.println("type the id to erase");
        Messages.table();
        System.out.println(myInventoryList.get(i) + "will be erased");
        myInventoryList.remove(i-1);
        showInventory(myInventoryList);

        System.out.println("===========================================================================================================================================================");
        return myInventoryList;
    }

    public ArrayList addInventory(ArrayList<Inventory> myInventoryList) {
        Messages.table();

        myInventoryList.add(new Inventory(0, "Example Added   ", "Example", "Example", 0, 0));

        myInventoryList.get(myInventoryList.size()-1).setId(myInventoryList.size());



        showInventory(myInventoryList);

        System.out.println("===========================================================================================================================================================");
        return myInventoryList;
    }


    public ArrayList showSize(ArrayList<Inventory> myInventoryList) {
        System.out.println("the current number songs number in  your playlist is : " + myInventoryList.size());
        return myInventoryList;
    }

}
