import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static int intV;
    static String srtV;
    static boolean flag;

    public static void main(String[] args) {
        System.out.println("Требования к введенной строке:\n" +
                "1. В строке не должно быть цифр \n" +
                "2. В строке не долдно быть 3 подряд одинаковые буквы.");
        do {
            System.out.println("Введите строку: ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            char[] c = str.toCharArray();
            equalsValue(c);
        } while (!flag);
        System.out.println("Введенная строка соответсвует требованиям");
    }

    public static boolean equalsValue(char[] mass) {
        try {
            for (int i = 0; i < mass.length - 2; i++) { //sdfsdf44 - не пашет || sdfsdf23 пашет
                if (Objects.equals(mass[i], mass[i + 2]) && Objects.equals(mass[i], mass[i + 1]))
                    throw new ClassException("Найдены 3 подряд идущих одинаковых букв. Буква: ", mass[i]);
            }
            return searchValue(mass);
        } catch (ClassException ce) {
            System.out.print(ce.getMessage());
            System.out.println(ce.getStr());
        }
        return flag = false;
    }

    public static boolean searchValue(char[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (Character.isDigit(mass[i]))
                throw new ClassException("Найдено число: ", mass[i]);
        }
        return flag = true;
    }
}
