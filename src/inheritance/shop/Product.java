package inheritance.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Product {

    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("########");

    //CAMPI
    private int code;
    private String name;
    private String description;
    private double price;

    private String fedelityCard;
    private static final double iva = 1.22;

    //GETTER e SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getFedelityCard(){
        return fedelityCard;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public void setFedelityCard(String fedelityCard){
        this.fedelityCard = fedelityCard;
    }

    //METODI
    public double priceIva(){
        return this.price * iva;
    }

    public double baseDiscount(){
        if (fedelityCard.equals("y")){
           return this.price = priceIva() * 0.98;
        } else {
            return this.price = priceIva();
        }
    }

    //COSTRUTTORE
    public Product() {
        code = Integer.parseInt(df.format(rand.nextInt(1,1000)));
        name = "unknown";
        description = "";
        price = 0;
    }

    public Product(String name, String description, double price) {
        code = Integer.parseInt(df.format(rand.nextInt(1, 1000)));
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shop{" + super.toString() +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}






