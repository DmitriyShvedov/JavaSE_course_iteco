import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int a = 4;
        final int b = 3;
        //int[][] array = {{1, 2, 3}, {9, 7, 5}, {4, 3, 2}, {6, 2, 6}};
        int array2[][] = new int[a][b];
        int array3[] = new int[a * b];
        int array[][] = new int[a][b];
        int sumLine = 0;
        int averValue = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите цифры через пробел либо по очереди, чтобы заполнить массив размером %d на %d: ", a, b);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ваш введенный массив: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", array[i][j]);
                if (j == 2)
                    System.out.print("\n");
            }
        }
        System.out.println("Суммы по линиям:");


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

        System.out.println("Суммы по столбцам:");
        int sumColumn = 0;
        for (int i = 0; i < a; i++) {
            sumColumn += array[i][0];
        }
        System.out.printf("Column 1: %d \n", sumColumn);

        sumColumn = 0;
        for (int i = 0; i < a; i++) {
            sumColumn += array[i][1];
        }
        System.out.printf("Column 2: %d \n", sumColumn);

        sumColumn = 0;
        for (int i = 0; i < a; i++) {
            sumColumn += array[i][2];
        }
        System.out.printf("Column 3: %d \n", sumColumn);


        //все нечетные элементы в масиве на 1, а четные на 0
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (array[i][j] % 2 == 1) {
                    array2[i][j] = 1;
                } else {
                    array2[i][j] = 0;
                }
            }
        }

        System.out.println("Мы заменили все нечетные элементы в масиве на 1, а четные на 0 и вот результат: ");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", array2[i][j]);
                if (j == 2)
                    System.out.print("\n");
            }
        }

        System.out.println("Среднее орифметическое для каждой строки: ");

        for (int j = 0; j < b; j++) {
            averValue += array[0][j];
        }
        averValue = averValue / b;
        System.out.printf("Row 1: %d \n", averValue);

        averValue = 0;
        for (int j = 0; j < b; j++) {
            averValue += array[1][j];
        }
        averValue = averValue / b;
        System.out.printf("Row 2: %d \n", averValue);

        averValue = 0;
        for (int j = 0; j < b; j++) {
            averValue += array[2][j];
        }
        averValue = averValue / b;
        System.out.printf("Row 3: %d \n", averValue);

        averValue = 0;
        for (int j = 0; j < b; j++) {
            averValue += array[3][j];
        }
        averValue = averValue / b;
        System.out.printf("Row 4: %d \n", averValue);

        //Преобразовываем 2мерный массив в одномерный
        int l = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array3[l] = array[i][j];
                l++;
            }
        }

        System.out.print("Преобразовали 2мерный массив в 1мерный: ");
        //выводим преобразованный масив
        for (int i : array3) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        //Переворачиваем 1мерный массив
        for (int i = 0; i < array3.length / 2; i++) {
            int temp = array3[i];
            array3[i] = array3[array3.length - 1 - i];
            array3[array3.length - 1 - i] = temp;
        }


        System.out.print("Выводим инвертированный массив: ");
        //Вывод инвертированного массива
        for (int i : array3) {
            System.out.printf("%d ", i);
        }


    }
}
