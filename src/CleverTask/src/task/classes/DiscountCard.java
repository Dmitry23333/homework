package task.classes;

public class DiscountCard {
    private int id;
    private int discount;

    public int getId() {
        return id;
    }

    public int getDiscount() {
        return discount;
    }

    public DiscountCard(int id, int discount) {
        this.id = id;
        this.discount = discount;
    }
}
