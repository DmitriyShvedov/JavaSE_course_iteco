public class Main {
    public static void main(String[] args) {

        String num1 = "-2 + 1";
        String[] tempArray = num1.split(" ");

        int[] afteParsToIntArray = parsStringToInt(tempArray);

        System.out.println(addNumbers(afteParsToIntArray));

    }



    public static int addNumbers(int[] array){
        int result = 0;
        int a = array[0];
        int b = array[1];
        return result = a + b;
    }

    public static int[] parsStringToInt(String[] array){
        int[] numberDoubl = new int[array.length-1];
        numberDoubl[0] = Integer.parseInt(array[0]);
        numberDoubl[1] = Integer.parseInt(array[2]);
        return numberDoubl;
    }

}
