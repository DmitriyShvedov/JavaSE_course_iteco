public class Employee extends Person implements Printable {


    @Override
    public void eating() {
        wantEat = false;
        System.out.println("Работодатель покушал");
    }

    @Override
    public void wantEating() {
        wantEat = true;
        System.out.println("Работодатель покушал");
    }

    @Override
    public void printVariebles() {
        System.out.println(super.getId());
    }
}
