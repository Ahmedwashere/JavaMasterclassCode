public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985"
        , "01/01/2020");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());


        SalariedEmployee joe = new SalariedEmployee("joe", "10/21/1992"
                , "03/03/2020", 35000);

        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Joe's paycheck =  $" + joe.collectPay());

        joe.retire();

        System.out.println("Joe's pension check is $" + joe.collectPay());

        HourlyEmployee allie = new HourlyEmployee("Allie", "01/12/2001", "02/12/2022", 45.23);

        System.out.println("Allie's pay = " + allie.collectPay());

        System.out.println("Allie's double pay is " + allie.getDoublePay());
    }

    public static void printWorker(Worker w){
        System.out.println(w);
    }
}