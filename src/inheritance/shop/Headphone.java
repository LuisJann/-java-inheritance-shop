package inheritance.shop;

public class Headphone extends Product{
//CAMPI
    private boolean cable;
    private String color;

    public boolean isCable() {
        return cable;
    }

    public String getColor() {
        return color;
    }

    public void setCable(boolean cable) {
        this.cable = cable;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Headphone(String name, String description, double price, boolean cable, String color) {
        super(name, description, price);
        this.cable = cable;
        this.color = color;
    }

    public Headphone() {
        this.cable = cable;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Headphone{" + super.toString() +
                "cable=" + cable +
                ", color='" + color + '\'' +
                '}';
    }
}
