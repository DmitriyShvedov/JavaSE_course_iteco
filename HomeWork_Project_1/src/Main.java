public class Main {
    public static void main(String[] args) {

        String num1 = "15 / -4";
        String[] tempArray = num1.split(" ");

        int[] afterParsToIntArray = parsStringToInt(tempArray);

        System.out.println(addNumbers(afterParsToIntArray));
        System.out.println(subtrNumbers(afterParsToIntArray));
        System.out.println(divNumbers(afterParsToIntArray));

    }



    public static int addNumbers(int[] array){
        int a = array[0];
        int b = array[1];
        return a + b;
    }
    public static int subtrNumbers(int[] array){
        int a = array[0];
        int b = array[1];
        return a - b;
    }
    public static float divNumbers(int[] array){
        int a = array[0];
        int b = array[1];
        return (float) a/b;
    }



    public static int[] parsStringToInt(String[] array){
        int[] numberDoubl = new int[array.length-1];
        numberDoubl[0] = Integer.parseInt(array[0]);
        numberDoubl[1] = Integer.parseInt(array[2]);
        return numberDoubl;
    }

}
