package inheritance.shop;

public class Tv extends Product{

    private int dimension;
    private boolean smart;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public Tv() {
        this.dimension = dimension;
        this.smart = smart;
    }

    public Tv(String name, String description, double price, int dimension, boolean smart) {
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
