import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int a = 4;
        final int b = 3;
        int array[][] = new int[a][b];

        System.out.printf("Введите цифры через пробел либо по очереди, чтобы заполнить массив размером %d на %d: ", a, b );
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ваш введенный массив: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf(" %d", array[i][j]);
                if (j == 2)
                    System.out.print("\n");
            }
        }
        System.out.println("Суммы по линиям:");

        int sumLine = 0;
        for (int j = 0; j < b; j++) {
            sumLine += array[0][j];
        }
        System.out.printf("Line 1: %d \n", sumLine);

        sumLine = 0;
        for (int j = 0; j < b; j++) {
            sumLine += array[1][j];
        }
        System.out.printf("Line 2: %d \n", sumLine);

        sumLine = 0;
        for (int j = 0; j < b; j++) {
            sumLine += array[2][j];
        }
        System.out.printf("Line 3: %d \n", sumLine);

        sumLine = 0;
        for (int j = 0; j < b; j++) {
            sumLine += array[3][j];
        }
        System.out.printf("Line 4: %d \n", sumLine);

    }
}
