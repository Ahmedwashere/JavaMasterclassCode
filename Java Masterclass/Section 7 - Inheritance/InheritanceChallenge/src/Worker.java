public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Worker(){
        this("Default Name", " 00/00/0000");
    }

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        try{
            int age = 2024 - Integer.parseInt(birthDate.substring(6));
            return age;
        } catch (NumberFormatException e){
            System.out.println("Please Include A Valid Birthday!");
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
