package VetPet.Employee;

public class Stylist extends Employee implements agenda {


    public Stylist(String name, String surname){
        this.name = name;
        this.surname = surname;
          }

    @Override
    public void schedule() {
        System.out.println("Method to  add at  the schedule a Stylists by default are 2 as well, and work from Monday to Saturday\n" +
                "until 4PM ");
    }

    @Override
    public void horasExtra() {
        System.out.println("code for calculate the extras");
    }

}
