package VetPet.Employee;

public class Doctor  extends Employee implements actions{


    public Doctor(String name, String surname){
        this.name = name;
        this.surname = surname;

    }

    @Override
    public void schedule() {
        System.out.println("Method to  add at  the schedule a  By default, there\n" +
                "are only two doctors from Monday to Wednesday. From Friday to Saturday, there is\n" +
                "another doctor.");
    }
}
