package task.classes;

public class Product {
    private String name;
    private int id;
    private double price;
    private boolean promo;


    public boolean isPromo() {
        return promo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, int id, double price, boolean promo) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.promo=promo;
    }
}
