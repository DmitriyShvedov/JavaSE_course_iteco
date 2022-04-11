import java.util.Scanner;

public class main {

    public static int i = 0;
    public static int result = 0;

    public static void main(String[] args) {

        String temp = "Дмитрий 2";
        System.out.println("Введите Имя и набор цифр для подсчета суммы(напр. Максим 711)");
        Scanner scr = new Scanner(System.in);
        String temp2 = scr.nextLine();
        if (checkWordAndValues(temp2)){
            do {
                System.out.println("Введите Имя и набор цифр(напр. Максим 711)");
                temp2 = scr.nextLine();

            }while (checkWordAndValues(temp2));
        }


        String[] words = temp2.split(" ");
        String[] values = words[1].split("");
        String firstName = words[0];

        int[] valueInt = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            valueInt[i] = Integer.parseInt(values[i]);
            System.out.println(valueInt[i]);
        }

        int summ = summValues(valueInt);
        String nameSummNumber = converterIntToString(summ);
        greetings(firstName, nameSummNumber);

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
    public static int checkSummValues(int[] array) {

        if (i >= array.length && result>10)
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
        System.out.println("Здравствуй, " + name + "! Сумма чисел в числе = " + summ);
    }

    public static String converterIntToString(int num){
        String temp;
        switch (num){
            case 1 :
                temp = "один";
                break;
            case 2 :
                temp = "два";
                break;
            case 3 :
                temp = "три";
                break;
            case 4 :
                temp = "четыре";
                break;
            case 5 :
                temp = "пять";
                break;
            case 6 :
                temp = "шесть";
                break;
            case 7 :
                temp = "семь";
                break;
            case 8 :
                temp = "восемь";
                break;
            case 9 :
                temp = "девять";
                break;
            case 10 :
                temp = "десять";
                break;

                default:
                    temp = "Ошибка в подчетах, либо сумма больше 10";

        }
        return temp;
    };

    public static Boolean checkWordAndValues(String str){
        String[] words = str.split(" ");
         if ((words[0] != null & !words[0].isEmpty()) & (!words[1].isEmpty() && words[1] != null)){
             return false;
         }else
             return true;

    };
}
