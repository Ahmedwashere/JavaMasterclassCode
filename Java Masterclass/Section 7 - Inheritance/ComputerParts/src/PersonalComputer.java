public class PersonalComputer extends Product{
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer,
                            Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    private void drawLogo(){
        monitor.drawPixelOut(154, 123, "white");
    }

    public void power(String OS){
        computerCase.pressPowerButton();
        loadOS(OS);
        drawLogo();
    }

    private void loadOS(String OS){
        motherboard.loadProgram(OS);
    }


//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }


}
