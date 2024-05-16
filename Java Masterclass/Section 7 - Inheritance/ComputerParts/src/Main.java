public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("ZLX model",
                "NXLZ", "240Hz");
        Monitor theMonitor = new Monitor("Odyessy G40B",
                "Samsung", 24, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("Hawk",
                "Razer", 4, 4, "v2.44");

        PersonalComputer pc = new PersonalComputer("Beast Mode", "Nvidia"
                , theMonitor, theMotherboard, theCase);

        //This is method chaining we get the monitor object and call one of monitors methods
        // from the pc class.
        pc.power("Ubuntu 13.2");

    }
}