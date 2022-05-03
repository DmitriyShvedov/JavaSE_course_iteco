public class Employee extends Person {

    @Override
    public void eating() {
        wantEat = false;
        System.out.println("Работодатель покушал");
    }
}
