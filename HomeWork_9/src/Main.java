import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static int intV;
    static String srtV;
    static boolean flag;

    public static void main(String[] args) {
        do {
            System.out.println("INPUT STR");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            char[] c = str.toCharArray();
            equalsValue(c);
        }while(!flag);


    }

    public static boolean equalsValue(char[] mass) {
        try {
            for (int i = 0; i < mass.length - 1; i++){ //sdfsdf44 - не пашет
                if (Objects.equals(mass[i], mass[i + 1]) && Objects.equals(mass[i], mass[i + 2]))
                    throw new ClassException("INPUT AGAIN. REPEED: ", mass[i]);
                }
            return searchValue(mass);
            }catch(ClassException ce){
                System.out.print(ce.getMessage());
                System.out.println(ce.getStr());
            }
        return flag = false;
    }

    public static boolean searchValue(char[] mass) {
        for(int i = 0; i < mass.length; i ++)
        if (Character.isDigit(mass[i])){
            System.out.println(mass[i]);
            return flag = false;
        }
        return flag = true;
        }

}
