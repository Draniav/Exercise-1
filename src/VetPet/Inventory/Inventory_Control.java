package VetPet.Inventory;

import java.util.ArrayList;

/*
This class containes the 'stock' of the store as mentioend in the exrceis we will handle
Three types of medicines: Pills, Syrups and Pet-care, wich is an ArrayList that will contain
the information and will be used as our 'data base'
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

}
