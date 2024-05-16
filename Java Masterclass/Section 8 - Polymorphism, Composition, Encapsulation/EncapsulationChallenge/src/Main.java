public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println("Tonor Level = " +  printer.addToner(2000));


        System.out.println("Tonor Level After adding over 100 = " + printer.addToner(101));


        System.out.println("Pages printed so far = " + printer.getPagesPrinted());
        printer.printPages(101);

        System.out.println("Pages printed after printed some = " + printer.getPagesPrinted());
        
        printer.printPages(101);

        System.out.println("Pages printed even more = " + printer.getPagesPrinted());

    }
}