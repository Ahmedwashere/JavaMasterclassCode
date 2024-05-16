public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S900" + i,
                    switch (i) {
                        case 1 -> "Ahmed";
                        case 2 -> "Dullah";
                        case 3 -> "Suokan";
                        case 4 -> "Mohammed";
                        case 5 -> "Naser";
                        default -> {
                            yield "Unknown student";
                        }
                    },
                    "05/11/2001",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S9006","Walid", "02/12/3425", "Cell Biology");
        LPAStudent LPAPojoStudent = new LPAStudent("S9007","Bill", "06/12/3425", "Cell Biology");

        System.out.println(pojoStudent.getName() + " is taking "+ pojoStudent.getClassList());
        System.out.println(LPAPojoStudent.name() + " is taking " + LPAPojoStudent.classList());

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Databases");
        // LPAPojoStudent.setClassList(); //Since Record data values are private final, they are immutable and cannot
                                          //Be changed once initialized.
        // If you would like to modify the data of a class DO NOT use a record.
    }
}