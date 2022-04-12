import java.util.Scanner;

public class main {

    public static int i = 0;
    public static int result = 0;

    public static void main(String[] args) {

        System.out.println("INPUT NAME AND NUMBERS (EX: Максим 711 )");
        Scanner scr = new Scanner(System.in);
        String temp = scr.nextLine();

        String[] words = temp.split(" ");

        while (!(checkNumbers(words) & checkName(words))) {
            temp = scr.nextLine();
            words = temp.split(" ");
        }

        String firstName = words[0];
        String[] values = words[1].split("");

        int[] valueInt = new int[values.length];

        parsStrToInt(values, valueInt);

        while (values.length < 2 || values.length > 5) {
            System.out.println("INPUT ONE MORE YOUR NUMBERS");
            temp = scr.nextLine();
            values = temp.split("");
        }

        valueInt = new int[values.length];

        parsStrToInt(values, valueInt);

        System.out.print("YOUR INPUT DATA: " + firstName + " ");
        for (String value : values) {
            System.out.print(value);
        }

        String nameSummNumber = converterIntToString(summValues(valueInt));
        greetings(firstName, nameSummNumber);

    }

    public static int[] parsStrToInt(String[] values, int[] valueInt) {
        for (int i = 0; i < values.length; i++) {
            valueInt[i] = Integer.parseInt(values[i]);
        }
        return valueInt;
    }

    public static Boolean checkNumbers(String[] words) {
        if (words.length != 2) {
            System.out.println("NO NUMBERS! REPEAT INPUT NAME AND NUMBERS");
            return false;
        }
        return true;
    }

    public static Boolean checkName(String[] words) {
        if (words[0].isEmpty()) {
            System.out.println("NO NAME! REPEAT INPUT NAME AND NUMBERS! ");
            return false;
        } else {
            return true;
        }
    }

    public static Boolean checkSummValues(int[] array) {

        int check = summValues(array);
        return check > 10;
    }


    public static int summValues(int[] array) {

        if (i >= array.length)
            return result;
        else {
            int temp = array[i];
            result += temp;
            i++;
            summValues(array);
        }
        return result;
    }

    public static void greetings(String name, String summ) {
        System.out.println("\n" + "Здравствуй, " + name + "! Сумма чисел в числе = " + summ);
    }

    public static String converterIntToString(int num) {
        String temp;
        switch (num) {
            case 1:
                temp = "один";
                break;
            case 2:
                temp = "два";
                break;
            case 3:
                temp = "три";
                break;
            case 4:
                temp = "четыре";
                break;
            case 5:
                temp = "пять";
                break;
            case 6:
                temp = "шесть";
                break;
            case 7:
                temp = "семь";
                break;
            case 8:
                temp = "восемь";
                break;
            case 9:
                temp = "девять";
                break;
            case 10:
                temp = "десять";
                break;

            default:
                temp = "Ошибка в подчетах, либо сумма больше 10";

        }
        return temp;
    }


}
