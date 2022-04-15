import java.util.Scanner;

public class Main {
    public static int result = 1;

    public static void main(String[] args) {

        System.out.println("Введите цифру нужного меню");
        menuPrint(1);

        Scanner scr = new Scanner(System.in);
        int temp = scr.nextInt();

        String num2 = menuChoice(temp);

        String[] tempArray = num2.split(" ");

        int[] afterParsToIntArray = parsStringToInt(tempArray);

        System.out.println(identifOperation(tempArray, afterParsToIntArray));

    }



    public static double identifOperation(String[] arrayStr, int[] arrayInt){
        switch (arrayStr[1]){
            case "+":
                return addNumbers(arrayInt);
            case "-":
                return subtrNumbers(arrayInt);
            case "/":
                return divNumbers(arrayInt);
            case "*":
                return multNumbers(arrayInt);
            case "^":
                return exponentNumber(arrayInt);
            case "!":
                return factNumbers(arrayInt);
            case "?":
                compNumber(arrayInt);

        }
        return 0;
    }

    public static void menuPrint(int i) {
        if(i == 1) {
            System.out.println("1. Ввести пример.");
            System.out.println("2. Продолжить работать с предыдущим ответом.");
            System.out.println("3. Выход.");
        }else {
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Факториал");
            System.out.println("6. Возведение в степень");
            System.out.println("7. Сравнение");
            System.out.println("8. Назад");
        }
    }

    public static String inputExample() {
        Scanner scr = new Scanner(System.in);
        return scr.nextLine();
    }

    public static String menuChoice(int choiceNumber) {
        switch (choiceNumber) {
            case 1:
                System.out.print("Введите пример (напр. 3 * 3): ");
                return inputExample();
            case 2:
                    menuPrint(2);
            case 3:
                System.exit(0);
        }

        return "ок";
    }


    public static int addNumbers(int[] array) {
        int a = array[0];
        int b = array[1];
        System.out.printf("\"+\" - %d + %d = ", a, b);
        return a + b;
    }

    public static int subtrNumbers(int[] array) {
        int a = array[0];
        int b = array[1];
        System.out.printf("\"-\" - %d - %d = ", a, b);
        return a - b;
    }

    public static float divNumbers(int[] array) {
        int a = array[0];
        int b = array[1];
        System.out.printf("\"/\" - %d / %d = ", a, b);
        return (float) a / b;
    }

    public static int multNumbers(int[] array) {
        int a = array[0];
        int b = array[1];
        System.out.printf("\"*\" - %d * %d = ", a, b);
        return a * b;
    }

    public static int factNumbers(int[] array) {
        if (array[0] < 1) {
            return result;
        } else {
            result *= array[0];
            array[0]--;
            factNumbers(array);
        }
        return result;
    }

    public static int exponentNumber(int[] array) {
        int a = array[0];
        int b = array[1];
        System.out.printf("\"^\" - %d ^ %d = ", a, b);
        return (int) Math.pow(a, b);
    }

    public static void compNumber(int[] array) {
        int a = array[0];
        int b = array[1];

        if (a > b) {
            System.out.printf("\"?\" - %d > %d", a, b);
        } else if (a == b) {
            System.out.printf("\"?\" - %d = %d", a, b);
        } else
            System.out.printf("\"?\" - %d < %d", a, b);
    }

    public static int[] parsStringToInt(String[] array) {
        int[] numberDoubl = new int[array.length - 1];
        numberDoubl[0] = Integer.parseInt(array[0]);
        if (array.length == 2) {
            return numberDoubl;
        } else
            numberDoubl[1] = Integer.parseInt(array[2]);

        return numberDoubl;
    }


}
