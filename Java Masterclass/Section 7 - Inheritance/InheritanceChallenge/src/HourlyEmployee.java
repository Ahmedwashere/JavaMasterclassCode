public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    // Constructor for Hourly Employee
    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate){
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(){
        super();
    }

    @Override
    public double collectPay(){
        return (int) 40 * hourlyPayRate;
    }


    public double getDoublePay(){
        return 2 * collectPay();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
