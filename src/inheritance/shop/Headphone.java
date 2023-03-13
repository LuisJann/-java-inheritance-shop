package inheritance.shop;

import java.util.Objects;

public class Headphone extends Product{
//CAMPI
    private String cable;
    private String color;

    public String isCable() {
        return cable;
    }

    public String getColor() {
        return color;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Headphone(String name, String description, double price, String cable, String color) {
        super(name, description, price);
        this.cable = cable;
        this.color = color;
    }

    public Headphone() {
        this.cable = cable;
        this.color = color;
    }

    //METODI


    @Override
    public double baseDiscount() {
        if(Objects.equals(cable, "y")){
            return this.setPrice(priceIva() * 0.93);
        }else {
            return super.baseDiscount();
        }
    }

    @Override
    public String toString() {
        return "Headphone{" + super.toString() +
                "cable=" + cable +
                ", color='" + color + '\'' +
                '}';
    }
}
