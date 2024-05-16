public class Device {

    private boolean hasWorkToDo;

    public Device(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isWorkToDo() {
        return hasWorkToDo;
    }

    public void HasWorkToDo(){
        hasWorkToDo = false;
    }


}

class Refrigerator extends Device{

    public Refrigerator(boolean hasWorkToDo){
        super(hasWorkToDo);
    }

    private void orderFood(){
        System.out.println("Food has been ordered");
    }

    @Override
    public void HasWorkToDo(){
        if(super.isWorkToDo()){
            orderFood();
            super.setHasWorkToDo(false);
        }
    }
}

class DishWasher extends Device{

    public DishWasher(boolean hasWorkToDo){
        super(hasWorkToDo);
    }

    private void doDishes(){
        System.out.println("The dishes are being done.");
    }

    @Override
    public void HasWorkToDo(){
        if(super.isWorkToDo()){
            doDishes();
            super.setHasWorkToDo(false);
        }
    }
}

class CoffeeMaker extends Device{

    public CoffeeMaker(boolean hasWorkToDo){
        super(hasWorkToDo);
    }

    private void brewCoffee(){
        System.out.println("The coffee is being brewed");
    }

    @Override
    public void HasWorkToDo(){
        if (super.isWorkToDo()){
            brewCoffee();
            super.setHasWorkToDo(false);
        }
    }
}

