public class Burger {
    private String type;
    private double basePrice;
    private double burgerAndToppingsPrice;
    private Topping t1;
    private Topping t2;
    private Topping t3;


    public Burger(String type, double basePrice) {
        this.type = type;
        this.basePrice = basePrice;
        this.burgerAndToppingsPrice = basePrice;
    }

    public double burgerFullPrice(){
        return burgerAndToppingsPrice;
    }

    public void addToppings(){
        if (t1 != null){
            burgerAndToppingsPrice += t1.getPrice();
        }
        if (t2 != null){
            burgerAndToppingsPrice += t2.getPrice();
        }
        if (t3 != null){
            burgerAndToppingsPrice += t3.getPrice();
        }
    }

    public void setT1(Topping t1) {
        this.t1 = t1;
    }

    public void setT2(Topping t2) {
        this.t2 = t2;
    }

    public void setT3(Topping t3) {
        this.t3 = t3;
    }
}
