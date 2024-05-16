public class DeluxeBurger extends Burger{

    private Topping t4;
    private Topping t5;
    private double deluxePrice;

    public DeluxeBurger(String type, double basePrice, Topping t4, Topping t5,
                        double deluxePrice) {
        super(type, deluxePrice);
        this.t4 = t4;
        this.t5 = t5;
        this.deluxePrice = deluxePrice;
    }

    @Override
    public void addToppings() {
        super.addToppings();
    }
}
