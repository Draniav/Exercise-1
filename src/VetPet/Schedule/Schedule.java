package VetPet.Schedule;

public class Schedule {
    private int id;

    private String day;
    private String presentation;//Pills, syrup, pet-care
    private String usage;//Veterinarian/Human
    private Integer quantity;
    private Integer stock;


    /**
     * attributes are initialized for use in the program
     *

     */
    public Schedule(int id, String day, String presentation, String usage, Integer quantity, Integer stock) {
        this.id = id;
        this.day = day;
        this.presentation = presentation;
        this.usage = usage;
        this.quantity = quantity;
        this.stock = stock;
    }

    /**
     * the interface to display the attributes is used throughout the program
     *
     * @return
     */
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
