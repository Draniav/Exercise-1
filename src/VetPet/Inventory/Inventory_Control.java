package VetPet.Inventory;

import VetPet.Messages;

import java.util.ArrayList;

public class Inventory_Control {

    public ArrayList upLoadInventaryList(ArrayList<Inventory> myInventoryList) {


        myInventoryList.add(new Inventory(0, "ibuprofen      ", "Pill", "Human", 8, 3));
        myInventoryList.add(new Inventory(0, "maxiperro      ", "Pet_care", "Veterinarian", 5, 1));
        myInventoryList.add(new Inventory(0, "maxiperro      ", "Pet_care", "Veterinarian", 5, 1));


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
    public ArrayList showInvetory(ArrayList<Inventory> myInventoryList) {


        Messages.table();

        for (int i = 0; i < myInventoryList.size(); i++) {
            System.out.println(myInventoryList.get(i));
        }
        System.out.println("===========================================================================================================================================================");
        return myInventoryList;
    }


    public ArrayList deleteItemInvetory(ArrayList<Inventory> myInventoryList) {
        Messages.table();
        showInvetory(myInventoryList);

        for (int i = 0; i < myInventoryList.size(); i++) {
            System.out.println(myInventoryList.get(i) + "will be erased");
        }


        System.out.println("===========================================================================================================================================================");
        return myInventoryList;
    }

    public ArrayList addInvetory(ArrayList<Inventory> myInventoryList) {
        Messages.table();

        for (int i = 0; i < myInventoryList.size(); i++) {
            //myInventoryList.get(i).setId(i + 1);
            System.out.println(myInventoryList.get(i));
        }
        System.out.println("===========================================================================================================================================================");
        return myInventoryList;
    }


    public ArrayList showSize(ArrayList<Inventory> myInventoryList) {
        System.out.println("the current number songs number in  your playlist is : " + myInventoryList.size());
        return myInventoryList;
    }

}
