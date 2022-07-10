package VetPet.Schedule;

import java.util.ArrayList;

public class Schedule_Control {

    public ArrayList upLoadScheduleList(ArrayList<Schedule> myScheduleList) {


        myScheduleList.add(new Inventory(0, "ibuprofen      ", "Pill", "Human", 8, 3));
        myScheduleList.add(new Inventory(0, "maxiperro      ", "Pet_care", "Veterinarian", 5, 1));
        myScheduleList.add(new Inventory(0, "maxiperro      ", "Pet_care", "Veterinarian", 5, 1));


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