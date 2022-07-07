package VetPet.Patiente;


import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Patient {

    protected String clinicNumber;
    protected String name;
    protected String surname;
    protected String breed;
    protected Owner owner;
    protected boolean isVaccinated;
    protected Date deparasitizationDate;


    //generates ramdon  id number to be used in  future
    protected String generateClinicalNumber (){
        int IDgen = ThreadLocalRandom.current().nextInt();
        return String.valueOf(IDgen);
    }

}


