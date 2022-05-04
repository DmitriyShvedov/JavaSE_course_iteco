public class Client extends Person implements Printable, SeasonHandler {


    @Override
    public void eating() {
        wantEat = false;
        System.out.println("Клиент покушал");
    }

    @Override
    public void wantEating() {
        wantEat = true;
        System.out.println("Клиент захотел кушать");
    }

    @Override
    public void print() {
        for(Season season : Season.values())
        System.out.printf("Сейчас %s, цвет сезона - %s \n" , season.name(), season.getColor() );
    }

    @Override
    public void printVariebles() {
        System.out.println(super.getId());
    }

}
