import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static int intV;
    static String srtV;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] c = str.toCharArray();
        equalsValue(c);

    }

    public static boolean equalsValue(char[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            if (Objects.equals(mass[i], mass[i+1]) && Objects.equals(mass[i], mass[i+2])) {
                System.out.println(mass[i]);
                return true;
            }
        }
        System.out.println("повторов нет");

        return searchValue(mass);
    }

    public static boolean searchValue(char[] mass) {
        for(int i = 0; i < mass.length; i ++)
        if (Character.isDigit(mass[i])){
            System.out.println(mass[i]);
            return true;
        }
        return false;
        }

}
