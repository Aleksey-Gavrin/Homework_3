public class Main {
    public static void main(String[] args)    {

        System.out.println();

        /*Задача 1

        Объявите переменные типа int, byte, short, long, float, double.
        Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
        Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».*/

        int intNumber = 156000;
        byte byteNumber = 64;
        short shortNumber = 25000;
        long longNumber = 45000125000L;
        float floatNumber = 5.86f;
        double doubleNumber = 4.896321478;
        System.out.println("Результат выполнения задачи 1:");
        System.out.println ("Значение переменной intNumber с типом int равно " + intNumber);
        System.out.println ("Значение переменной byteNumber с типом byte равно " + byteNumber);
        System.out.println ("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println ("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println ("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println ("Значение переменной doubleNumber с типом double равно " + doubleNumber);

        System.out.println ();

        /*Задача 2

        Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        Значения:
        27.12
        987 678 965 549
        2,786
        569
        -159
        27897
        67*/

        float firstNumber = 27.12f;
        long secondNumber = 987678965549L;
        float thirdNumber = 2.786f;
        short fourthNumber = 569;
        short fifthNumber = -159;
        int sixthNumber = 27897;
        byte seventhNumber = 67;
        System.out.println("Результат выполнения задачи 2:");
        System.out.println (firstNumber);
        System.out.println (secondNumber);
        System.out.println (thirdNumber);
        System.out.println (fourthNumber);
        System.out.println (fifthNumber);
        System.out.println (sixthNumber);
        System.out.println (seventhNumber);

        System.out.println ();

        /*Задача 3

        Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        Для объявления переменных не используйте тип var.*/

        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        short totalStudents = (short) (ludmilaStudents + annaStudents + ekaterinaStudents);
        short totalPaper = 480;
        short paperPerStudent = (short) (totalPaper / totalStudents);
        System.out.println("Результат выполнения задачи 3:");
        System.out.println ("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        System.out.println ();

        /*Задача 4

        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        за 20 минут,
        в сутки,
        за 3 дня,
        за 1 месяц?
        Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        Для объявления переменных не используйте тип var.*/

        byte bottlesIn2Minutes = 16;
        short bottlesIn20Minutes = (short) (bottlesIn2Minutes * 10);
        System.out.println("Результат выполнения задачи 4:");
        System.out.println ("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        short bottlesIn24Hours = (short) (bottlesIn20Minutes * 3 * 24);
        System.out.println ("За сутки машина произвела " + bottlesIn24Hours + " штук бутылок");
        int bottlesIn3Days = bottlesIn24Hours * 3;
        System.out.println ("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        int bottlesIn1Month = bottlesIn24Hours * 30;
        System.out.println ("За месяц машина произвела " + bottlesIn1Month + " штук бутылок");

        System.out.println ();

        /*Задача 5

        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4
        банки коричневой краски. Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        Для объявления переменных не используйте тип var.*/

        short paintTotal = 120;
        byte paintWhite1Room = 2;
        byte paintBrown1Room = 4;
        short roomsQty = (short) (paintTotal / (paintWhite1Room + paintBrown1Room));
        short paintWhiteTotal = (short) (paintWhite1Room * roomsQty);
        short paintBrownTotal = (short) (paintBrown1Room * roomsQty);
        System.out.println("Результат выполнения задачи 5:");
        System.out.println ("В школе, где " + roomsQty + " классов, нужно " + paintWhiteTotal + " банок белой краски и " + paintBrownTotal + " банок коричневой краски.");

        System.out.println ();

        /*Задача 6

        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.
        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        Результат в граммах и килограммах напечатайте в консоль.*/

        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        short recipeWeightGr = (short) (bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4);
        float recipeWeightKg = recipeWeightGr / 1000f;
        System.out.println("Результат выполнения задачи 6:");
        System.out.println ("Вес спортзавтрака - " + recipeWeightGr + " грамм или " + recipeWeightKg + " килограмм.");

        System.out.println ();

        /*Задача 7

        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько —
        если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.*/

        byte weightToLose = 7;
        float weightLossMin = 0.25f;
        float weightLossMax = 0.5f;
        short daysGoalMin = (short) (weightToLose / weightLossMax);
        short daysGoalMax = (short) (weightToLose / weightLossMin);
        short daysGoalAvg = (short) ((daysGoalMin + daysGoalMax) / 2);
        System.out.println("Результат выполнения задачи 7:");
        System.out.println("Чтобы добиться результата похудения на " + weightToLose + " кг, потребуется минимум " + daysGoalMin +
                " дней, максимум - " + daysGoalMax + " дней. А в среднем потребуется " + daysGoalAvg + " дней.");



    }
}