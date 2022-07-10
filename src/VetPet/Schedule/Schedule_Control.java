package VetPet.Schedule;

import java.util.ArrayList;

public class Schedule_Control {

    public ArrayList upLoadScheduleList(ArrayList<Schedule> myScheduleList) {

        myScheduleList.add(new Schedule(0, "9:30", "07", "07", "2022", "Asthetic", "000001", "Doctor1", "pepe"));


        for (int i = 0; i < myScheduleList.size(); i++) {
            myScheduleList.get(i).setIdAppointment(i + 1);
        }

        return myScheduleList;

    }

//----------------------------------------------------------------------------------------------------------------------
public ArrayList showSchedule(ArrayList<Schedule> myScheduleList) {

    Messages.table();

    for (int i = 0; i < myScheduleList.size(); i++) {
        System.out.println(myScheduleList.get(i));
    }
    System.out.println("===========================================================================================================================================================");
    return myScheduleList;
}


    public ArrayList deleteSchedule(ArrayList<Schedule> myScheduleList) {
        int i = 0;
        Scanner sn = new Scanner(System.in);
        i = sn.nextInt();

        showSchedule(myScheduleList);
        System.out.println("type the id to erase");
        Messages.table();
        System.out.println(myScheduleList.get(i) + "will be erased");
        myScheduleList.remove(i-1);
        showSchedule(myScheduleList);

        System.out.println("===========================================================================================================================================================");
        return myScheduleList;
    }

    public ArrayList addSchedule(ArrayList<Schedule> myScheduleList) {
        Messages.table();

        myScheduleList.add(new Schedule(0, "Example Added   ", "Example", "Example", 0, 0));


        myScheduleList.get(myScheduleList.size()-1).setId(myScheduleList.size());





        System.out.println("===========================================================================================================================================================");
        return myScheduleList;
    }


    public ArrayList showSize(ArrayList<Schedule> myScheduleList) {
        System.out.println("the current number songs number in  your playlist is : " + myScheduleList.size());
        return myScheduleList;
    }


}