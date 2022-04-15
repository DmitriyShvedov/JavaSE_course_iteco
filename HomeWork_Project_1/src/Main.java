public class Main {
    public static int result = 0;
    public static void main(String[] args) {

        String num1 = "88 !";
        String[] tempArray = num1.split(" ");

        int[] afterParsToIntArray = parsStringToInt(tempArray);

       //System.out.println(addNumbers(afterParsToIntArray));
        //System.out.println(subtrNumbers(afterParsToIntArray));
        //System.out.println(divNumbers(afterParsToIntArray));
        //System.out.println(multNumbers(afterParsToIntArray));
        System.out.println(factNumbers(afterParsToIntArray));

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
    public static int multNumbers(int[] array){
        int a = array[0];
        int b = array[1];
        return a*b;
    }
    public static int factNumbers(int[] array){
        if (array[0] < 1){
            return result;
        }else
        {
            result += array[0];
            array[0]--;
            factNumbers(array);
        }
        return result;
    }




    public static int[] parsStringToInt(String[] array){
        int[] numberDoubl = new int[array.length-1];
        numberDoubl[0] = Integer.parseInt(array[0]);
        if (array.length == 2){
            return numberDoubl;
        }else
        numberDoubl[1] = Integer.parseInt(array[2]);

        return numberDoubl;
    }

}
