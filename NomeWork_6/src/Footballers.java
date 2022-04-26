public class Footballers extends Sportsman {
    private int countGoal;
    public int countMach;
    protected String footballClub;
    private int zp;


    public Footballers(){

    }

    public Footballers(int age, int ves, int rost, String sName){
        super(age, ves, rost, sName);
        System.out.printf("Был выпущен из школы футболист %s с ростом %d, с весом %d, и возрастом %d! \n" , secondName, rost, ves, age);

    }

    public int getZp() {
        return zp;
    }

    public void setZp(int zp) {
        System.out.print("Обновили ЗП игроку: ");
        this.zp = zp;
    }

    public int getCountGoal() {
        return countGoal;
    }

    public void setCountGoal(int countGoal) {
        this.countGoal = countGoal;
    }

    public void addCountGoal(int add){
        int a = getCountGoal() + add;
        setCountGoal(a);
        System.out.printf("Футболист %s увеличил кол-во голов за всю карьеру до %d штук \n" , secondName , getCountGoal());
    }

    public void test(){
        System.out.println("test. im footbalers");
    }

    @Override
    public void test1() {
        System.out.println("test1 football");
    }


}
