import java.util.Scanner;

public class Main {
    public static int factorialResult = 1;

    public static int lastNumberAfterOperation = 0;

    public static void main(String[] args) {

        menuPrint(1);

    }


    public static int identifOperation(String[] arrayStr, int[] arrayInt){
        switch (arrayStr[1]){
            case "+":
                return addNumbers(arrayInt);
            case "-":
                return subtrNumbers(arrayInt);
            case "/":
                return (int)divNumbers(arrayInt);
            case "*":
                return multNumbers(arrayInt);
            case "^":
                return exponentNumber(arrayInt);
            case "!":
                System.out.printf("\"!\" - %d! = ", arrayInt[0]);
                return factNumbers(arrayInt);
            case "?":
                compNumber(arrayInt);

        }
        return 0;
    }

    public static int identifOperation(String arrayStr, int[] arrayInt){
        switch (arrayStr){
            case "+":
                return addNumbers(arrayInt);
            case "-":
                return subtrNumbers(arrayInt);
            case "/":
                return (int)divNumbers(arrayInt);
            case "*":
                return multNumbers(arrayInt);
            case "^":
                return exponentNumber(arrayInt);
            case "!":
                System.out.printf("\"!\" - %d! = ", arrayInt[0]);
                return factNumbers(arrayInt);
            case "?":
                compNumber(arrayInt);

        }
        return 0;
    }

    public static void menuPrint(int i) {
        if(i == 1) {
            System.out.println("Введите цифру нужного меню");
            System.out.println("1. Ввести пример.");
            System.out.println("2. Продолжить работать с предыдущим ответом.");
            System.out.println("3. Выход.");
            Scanner scr = new Scanner(System.in);
            int temp = scr.nextInt();
            menuChoice(temp);
        }else {
            System.out.println("Введите цифру нужного меню");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Факториал");
            System.out.println("6. Возведение в степень");
            System.out.println("7. Сравнение");
            System.out.println("8. Назад");
            Scanner scr = new Scanner(System.in);
            int temp = scr.nextInt();
            menuChoice2(temp);
        }
    }

    public static int inputExample() {
        Scanner scr = new Scanner(System.in);
        String num = scr.nextLine();
        String[] tempArray = num.split(" ");
        int[] afterParsToIntArray = parsStringToInt(tempArray);
        return identifOperation(tempArray,afterParsToIntArray);
    }
    public static int inputExample(int a, String sign){
        Scanner scr = new Scanner(System.in);
        int[] num = new int[2];
        num[0] = a;
        num[1] = scr.nextInt();
        return identifOperation(sign, num);
    }

    public static int menuChoice(int choiceNumber) {
        switch (choiceNumber) {
            case 1:
                System.out.print("Введите пример (напр. 3 * 3): ");
                lastNumberAfterOperation = inputExample();
                System.out.println(lastNumberAfterOperation);
                menuPrint(1);
            case 2:
                menuPrint(2);

            case 3:
                System.exit(0);
        }
        return 1;
    }

    public static String menuChoice2(int choiceNumber){
        switch (choiceNumber){
            case 1:
                System.out.printf("Сложение. Введите второе число (первый операнд. %d): ", lastNumberAfterOperation);
                String sign = "+";
                int newNumber = inputExample(lastNumberAfterOperation,sign);
                System.out.println(newNumber);
                menuPrint(1);
            case 2:
                System.out.println("2. Вычитание");
                break;
            case 3:
                System.out.println("3. Умножение");
                break;
            case 4:
                System.out.println("4. Деление");
                break;
            case 5:
                System.out.println("5. Факториал");
                break;
            case 6:
                System.out.println("6. Возведение в степень");
                break;
            case 7:
                System.out.println("7. Сравнение");
                break;
            case 8:
                menuPrint(1);
            default:
                System.out.println("Неверно");
        }
        return "ok";
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

        if (array[0] <= 1) {
            System.out.print(array[0] +" = ");
            return factorialResult;
        } else {
            System.out.print(array[0] +" * ");
            factorialResult *= array[0];
            array[0]--;
            factNumbers(array);
        }
        return factorialResult;
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
            System.out.printf("\"?\" - %d > %d. ", a, b);
        } else if (a == b) {
            System.out.printf("\"?\" - %d = %d. ", a, b);
        } else
            System.out.printf("\"?\" - %d < %d. ", a, b);
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
