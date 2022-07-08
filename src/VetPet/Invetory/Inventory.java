package VetPet.Invetory;

import java.util.Date;

public class Inventory {
    private int id;
    private String name;
    private String presentation;
    private Boolean usage;
    private Integer quantity;
    private Integer stock;


    /**
     * attributes are initialized for use in the program
     *

     */
    public Inventory(int id, String name, String presentation, Boolean usage, Integer quantity, Integer stock) {
        this.id = id;
        this.name = name;
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

    public Boolean getUsage() {
        return usage;
    }

    public void setUsage(Boolean usage) {
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
