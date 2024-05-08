package discount;

public class SaleDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount * 0.1;
    }
}
