public class MealOrder {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public MealOrder(){
        this(new Burger("Regular Burger", 5.99),
                new Drink("Coke", "Medium"),
                new SideItem("Lays Chips", 1.99));
    }


}
