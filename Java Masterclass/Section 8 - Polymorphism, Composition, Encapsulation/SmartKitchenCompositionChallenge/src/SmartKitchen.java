public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster,
                        DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater(){
        if (brewMaster.isWorkToDo()){
            System.out.println("There is already work to do for the" +
                    " coffee marker.");
        } else{
            brewMaster.setHasWorkToDo(true);
        }
    }

    public void pourMilk() {
        if (iceBox.isWorkToDo()) {
            System.out.println("There is already work to do for the" +
                    " refrigerator.");
        } else {
            iceBox.setHasWorkToDo(true);
        }
    }

    public void loadDishwasher() {
        if (dishWasher.isWorkToDo()){
            System.out.println("There is already work to do for the" +
                    " dish washer.");
        } else{
            dishWasher.setHasWorkToDo(true);
        }
    }

    public void setKitchenState(boolean cState, boolean dState,
                                boolean rState){
        if (cState){
            addWater();
        }

        if (dState){
            loadDishwasher();
        }

        if (rState){
            pourMilk();
        }
    }

    public void doKitchenWork(){
        brewMaster.HasWorkToDo();
        iceBox.HasWorkToDo();
        dishWasher.HasWorkToDo();
    }


}
