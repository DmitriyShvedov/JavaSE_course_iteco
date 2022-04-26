public class Main {
    public static void main(String[] args) {

        Sportsman swimmer1 = new Swimmers();
        Swimmers swimmer2 = new Swimmers();
        Swimmers swimmer3 = new Swimmers( 0, 18, 75, 190, "Шведов");
        Footballers footballer1 = new Footballers(18, 66, 180, "Акинфеев");
        Sportsman footballer2 = new Footballers(17, 88, 175, "Шведов");

        swimmer2.secondName = "Дудак";
        swimmer2.setRasstoyanie(2);
        swimmer2.addRasstoyanie(40);


        swimmer3.addRasstoyanie(5);
        swimmer3.addRasstoyanie(40);

        footballer1.addCountGoal(5);
        footballer1.addCountGoal(30);
        footballer1.setZp(100000000);
        System.out.println(footballer1.getZp());

        swimmer2.olympicMedals = 3;

        footballer2.test();
        footballer2.test1();

        swimmer2.test();
        swimmer2.test1();
    }
}
