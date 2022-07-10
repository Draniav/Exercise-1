package VetPet.Schedule;

import java.util.ArrayList;

public class Schedule_Control {

    public ArrayList upLoadScheduleList(ArrayList<Schedule> myScheduleList) {

        myScheduleList.add(new Schedule(0, "9:30", "07", "07", "2022", "Asthetic", "000001", "Doctor1", "1121954001", "pepe"));
        
        for (int i = 0; i < myScheduleList.size(); i++) {
            myInventoryList.get(i).setId(i + 1);
        }

        return myInventoryList;

    }

}