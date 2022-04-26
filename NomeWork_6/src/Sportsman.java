public abstract class Sportsman {
    int age;
    int rost;
    int ves;
    String secondName;

    public Sportsman(int age, int rost, int ves, String secondName){
        this.age = age;
        this.rost = rost;
        this.ves = ves;
        this.secondName = secondName;
    }
    public Sportsman(){

    }

    public abstract void test();

    public abstract void test1();

}
