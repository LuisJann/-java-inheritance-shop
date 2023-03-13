package inheritance.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Smartphone extends Product {
    DecimalFormat df = new DecimalFormat();
    Random rand = new Random();
    private int imei;
    private int memory;

    public int getImei() {
        return imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    public Smartphone(){
        this.imei = getCodeImei();
        this.memory = 0;
    }

    public Smartphone(String name, String description, double price, int memory) {
        super(name, description, price);
        this.imei = getCodeImei();
        this.memory = memory;
    }

    //METODI
    public int getCodeImei(){
        return imei = rand.nextInt(111111111,999999999);
    }

    @Override
    public double baseDiscount() {
       if (this.memory <= 32){
           return this.setPrice(priceIva() * 0.95);
       }else{
           return super.baseDiscount();
       }
    }

    @Override
    public String toString() {
        return "Smartphone{" + super.toString() +
                "imei=" + imei +
                ", memory=" + memory +
                '}';
    }
}
