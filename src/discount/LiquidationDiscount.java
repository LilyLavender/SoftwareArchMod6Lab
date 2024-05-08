package discount;

public class LiquidationDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount * 0.75;
    }
}
