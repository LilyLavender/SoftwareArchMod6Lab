package discount;

public class CustomerOrder {
    private String customerName;
    private double billAmount;
    private DiscountStrategy discountStrategy;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        switch (discountType) {
            case 'S':
            case 's':
                this.discountStrategy = new SaleDiscount();
                break;
            case 'D':
            case 'd':
                this.discountStrategy = new DiscountDiscount();
                break;
            case 'L':
            case 'l':
                this.discountStrategy = new LiquidationDiscount();
                break;
            default:
                this.discountStrategy = null;
        }
    }

    public double getBillAmount() {
        return billAmount - discountStrategy.applyDiscount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + '}';
    }
}
