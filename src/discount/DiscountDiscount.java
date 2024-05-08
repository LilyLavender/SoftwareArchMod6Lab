package discount;

public class DiscountDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount * 0.5;
    }
}
