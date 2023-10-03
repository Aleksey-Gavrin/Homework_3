public class Main {
    public static void main(String[] args)    {
        int intNumber = 156000;
        byte byteNumber = 64;
        short shortNumber = 25000;
        long longNumber = 45000125000L;
        float floatNumber = 5.86f;
        double doubleNumber = 4.896321478;
        System.out.println ("Значение переменной intNumber с типом int равно " + intNumber);
        System.out.println ("Значение переменной byteNumber с типом byte равно " + byteNumber);
        System.out.println ("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println ("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println ("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println ("Значение переменной doubleNumber с типом double равно " + doubleNumber);

        float firstNumber = 27.12f;
        long secondNumber = 987678965549L;
        float thirdNumber = 2.786f;
        short fourthNumber = 569;
        short fifthNumber = -159;
        int sixthNumber = 27897;
        byte seventhNumber = 67;

        System.out.println ();

        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        short totalStudents = (short) (ludmilaStudents + annaStudents + ekaterinaStudents);
        short totalPaper = 480;
        short paperPerStudent = (short) (totalPaper / totalStudents);
        System.out.println ("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        System.out.println ();

        byte bottlesIn2Minutes = 16;
        short bottlesIn20Minutes = (short) (bottlesIn2Minutes * 10);
        System.out.println ("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        short bottlesIn24Hours = (short) (bottlesIn20Minutes * 3 *24);
        System.out.println ("За сутки машина произвела " + bottlesIn24Hours + " штук бутылок");
        int bottlesIn3Days = bottlesIn24Hours * 3;
        System.out.println ("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        int bottlesIn1Month = bottlesIn24Hours * 30;
        System.out.println ("За месяц машина произвела " + bottlesIn1Month + " штук бутылок");

        System.out.println ();


    }
}