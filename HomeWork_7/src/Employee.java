public class Employee extends Person implements Printable, SeasonHandler {


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
    public void print() {
        for(Season season : Season.values())
            System.out.printf("Empl. Сейчас %s, цвет сезона - %s \n" , season.name(), season.getColor() );
    }

    @Override
    public void printVariebles() {
        System.out.println(super.getId());
    }
}
