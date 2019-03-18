public class ex1 {

    public static void main(String[] args) {

        task2();
        task3();
        task4(5, 8);
        task5();
        task6(-80);
        task7();
        task8(2001);


    }

    public static void task8(int year){
        System.out.println("=============================================");
        System.out.println("ЗАДАНИЕ 8");
        boolean b = year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
        if (b == true) {
            System.out.println("год " + year + " высокосный");
        }else {
            System.out.println("год " + year + " обычный");
        }
    }

    private static void task7() {
        System.out.println("=============================================");
        System.out.println("ЗАДАНИЕ 7");
        String  s =  "Иван";
        System.out.println("Привет " + s);
    }

    private static boolean task6( int varXX) {

        System.out.println("=============================================");
        System.out.println("ЗАДАНИЕ 6");
        System.out.println (varXX < 0);
        return false;
    }

    private static void task5() {
        int varNumber = 0;

        System.out.println("=============================================");
        System.out.println("ЗАДАНИЕ 5");
        if (varNumber > 0 ){
            System.out.println( "Значение " + varNumber + " больше 0");
        }
        if (varNumber < 0){
            System.out.println("Значние " + varNumber + " меньше 0");
        }
        if (varNumber == 0){
            System.out.println( "Значение " + varNumber + " = 0");
        }

    }

    private static boolean task4(int varA, int varB) {
        System.out.println("=============================================");
        System.out.println("ЗАДАНИЕ 4");

        int varC = varA + varB;
        System.out.println(varC >= 10 && varC <= 20);
        return false;
    }

    private static void task3() {
        int a = 2;
        int b = 25;
        int d = 80;
        int c = -38;

        int answer = a * (b + (c / d));
        System.out.println("========================================================");
        System.out.println("ЗАДАНИЕ 3");
        System.out.println(answer);


    }

    private static void task2() {
        int valInt = 20;
        long valLong = 500;
        float valFloat = 2.5f;
        double valDouble = 5.5;
        short valShort = 1000;
        byte valByte = 18;
        char valChar = 'x';
        boolean val = false;
        System.out.println("ЗАДАНИЕ 2");
        System.out.println("Минимальное значение Integer: " + Integer.MIN_VALUE);
        System.out.println("Максимальное значение Integer: " + Integer.MAX_VALUE);
        System.out.println("int = " + valInt);

        System.out.println("========================================================");
        System.out.println("Минимальное значение Long: " + Long.MIN_VALUE);
        System.out.println("Максимальное значение Long: " + Long.MAX_VALUE);
        System.out.println("long " + valLong);

        System.out.println("========================================================");
        System.out.println("Минимальное значение Float: " + Float.MIN_VALUE);
        System.out.println("Максимальное значение Float: " + Float.MAX_VALUE);
        System.out.println("float " + valFloat);
        System.out.println("========================================================");

        System.out.println("Минимальное значение Double: " + Double.MIN_VALUE);
        System.out.println("Максимальное значение Double: " + Double.MAX_VALUE);
        System.out.println("double " + valDouble);
        System.out.println("========================================================");


        System.out.println("Минимальное значение Short: " + Short.MIN_VALUE);
        System.out.println("Максимальное значение Short: " + Short.MAX_VALUE);
        System.out.println("short " + valShort);
        System.out.println("========================================================");

        System.out.println("Минимальное значение Short: " + Byte.MIN_VALUE);
        System.out.println("Максимальное значение Short: " + Byte.MAX_VALUE);
        System.out.println("byte " + valByte);
        System.out.println("========================================================");

        System.out.println("значение Char = " + valChar);
        System.out.println("значение Char = " + valChar);


    }


}


