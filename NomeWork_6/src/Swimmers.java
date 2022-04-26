public class Swimmers extends Sportsman{
    private int rasstoyanie;
    public int olympicMedals;

    public Swimmers(int rasstoyanie,int age, int ves, int rost, String sName){
        super(age, ves, rost, sName);
        this.rasstoyanie = rasstoyanie;
        System.out.printf("Был выпущен из школы пловец %s с ростом %d, с весом %d, и возрастом %d! \n" , secondName, rost, ves, age);

    }

    public Swimmers(){

    }


    public int getRasstoyanie() {
        return rasstoyanie;
    }

    public void setRasstoyanie(int rasstoyanie) {
        this.rasstoyanie = rasstoyanie;
    }

    public void addRasstoyanie(int add){
        int a = getRasstoyanie() + add;
        setRasstoyanie(a);
        System.out.printf("Пловец %s увеличил расстояние которое проплыл за всю карьеру до %d км \n" , secondName , getRasstoyanie());
    }


    @Override
    public void test1() {
        System.out.println("test1 SWIM");
    }

    public void test(){
        System.out.println("test. im swimmer");
    }
}
