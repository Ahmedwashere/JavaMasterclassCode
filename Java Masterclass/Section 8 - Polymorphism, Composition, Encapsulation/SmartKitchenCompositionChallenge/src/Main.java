public class Main {
    public static void main(String[] args) {

        CoffeeMaker brewMaster = new CoffeeMaker(false);
        Refrigerator fridge = new Refrigerator(false);
        DishWasher dishWasher = new DishWasher(false);

        SmartKitchen smartKitchen = new SmartKitchen(brewMaster, dishWasher, fridge);

        smartKitchen.addWater();
        smartKitchen.pourMilk();
        smartKitchen.doKitchenWork();

        System.out.println("-".repeat(35));

        smartKitchen.setKitchenState(true, true, false);
        smartKitchen.doKitchenWork();

    }
}