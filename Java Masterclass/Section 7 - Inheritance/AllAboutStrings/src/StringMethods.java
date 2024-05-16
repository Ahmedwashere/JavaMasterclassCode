public class StringMethods {

    public static void main(String[] args) {

        String birthdate = "25/11/2982";
        int startingIndex = birthdate.indexOf("2982");
        System.out.println("Starting index = " + startingIndex);
        System.out.println("Substring = " + birthdate.substring(startingIndex));
        System.out.println("Month Starting index = " + birthdate.indexOf("11"));
        System.out.println("Month String = " + birthdate.substring(birthdate.indexOf("11"), birthdate.indexOf("11") + 2));

        String bulletedList = String.join("\t", "Ahmed", "Hany", "Ibrahim", "El-Desoky", "Mohammed"
        , "Suleiman", "Salam");
        System.out.println("Full Name = " + bulletedList);

        String noSinName = bulletedList.replace('\t', '\n');
        System.out.println(noSinName);


    }
}
