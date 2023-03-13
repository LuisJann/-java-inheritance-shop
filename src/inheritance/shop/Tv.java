package inheritance.shop;

public class Tv extends Product{

    private int dimension;
    private String smart;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public String isSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    public Tv() {
        this.dimension = dimension;
        this.smart = smart;
    }

    public Tv(String name, String description, double price, int dimension, String smart) {
        super(name, description, price);
        this.dimension = dimension;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Tv{" + super.toString() +
                "dimension=" + dimension +
                ", smart=" + smart +
                '}';
    }
}
