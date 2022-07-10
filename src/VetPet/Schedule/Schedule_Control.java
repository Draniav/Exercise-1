package VetPet.Schedule;

import java.util.ArrayList;

public class Schedule_Control {

    public ArrayList upLoadScheduleList(ArrayList<Schedule> myScheduleList) {

        myScheduleList.add(new Schedule(0, "9:30", "07", "07", "2022", "Asthetic", "000001", "Doctor1", "1121954001", "pepe"));
        myScheduleList.add(new Schedule(0, "9:00", "08", "07", "2022", "Medical", "000002", "Doctor2", "1121954001", "pepa"));
        myScheduleList.add(new Schedule(0, "10:30", "09", "07", "2022", "Asthetic", "000003", "Doctor2", "1121954001", "pupo"));
        myScheduleList.add(new Schedule(0, "10:00", "09", "07", "2022", "Medical", "000004", "Doctor3", "1121954001", "papa"));
        myScheduleList.add(new Schedule(0, "11:00", "10", "07", "2022", "Asthetic", "000005", "Doctor2", "1121954001", "pipa"));
        myScheduleList.add(new Schedule(0, "11:30", "11", "07", "2022", "Medical", "000006", "Doctor1", "1121954001", "pape"));
        myScheduleList.add(new Schedule(0, "12:30", "12", "07", "2022", "Asthetic", "000007", "Doctor1", "1121954001", "pupu"));

        for (int i = 0; i < myScheduleList.size(); i++) {
            myInventoryList.get(i).setId(i + 1);
        }

        return myInventoryList;

    }

}