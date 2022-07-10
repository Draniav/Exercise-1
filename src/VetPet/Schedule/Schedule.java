package VetPet.Schedule;

public class Schedule {

    private String hour;
    private String day;
    private String month;
    private String year;
    private String typeOfAppintment; //medical or asthetic
    private String  activeDoctor;
    private String IdPatient;

    public Schedule(String hour, String day, String month, String year, String typeOfAppintment, String activeDoctor, String idPatient) {
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
        this.typeOfAppintment = typeOfAppintment;
        this.activeDoctor = activeDoctor;
        IdPatient = idPatient;
    }

   
    @Override
    public String toString() {

        return "Product ID  " + id + " |" + name + " | " + presentation + " |  " + usage + "    | " + quantity + " | " + stock +"  | ";
    }

    /**
     * we use the get and set methods to display and modify the value of attributes
     *
     * @return returns the value assigned or that we want to display
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
