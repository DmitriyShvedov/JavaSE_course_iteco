public class Main {

    public static void main(String[] args) {

        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};
        int j = 0;

        System.out.print("Все элементы массива: ");
        do{
            System.out.print(array[j] + " ");
            j++;
        }while (j < array.length);


        //Ищем все четные элементы массива
        System.out.print("\n" + "Четные элементы массива: ");

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }


        //Ищем все двузначные числа
        System.out.print("\n" + "Двузначные элементы массива: ");

        for (int i = 0; i < array.length; i++){
            if (array[i] > 10) {
                System.out.print(array[i] + " ");
            }
        }


        //Ищем наибольшее число массива
        System.out.print("\n" + "Наибольшее число массива: ");
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.print(maxValue);

        //Вычисляем сумму элементов
        System.out.print("\n" + "Сумма элементов массива: ");
        int summValue = 0;

        for (int i = 0; i < array.length; i++){
            summValue = summValue + array[i];
        }
        System.out.print(summValue);

        //Переворачиваем массив в обратный порядок
        System.out.print("\n" + "Инвертированный массив: ");
        int f = 0;

        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]= temp;
        }

        do {
            System.out.print(array[f] + " ");
            f++;
        }while (f < array.length);

    }
}
