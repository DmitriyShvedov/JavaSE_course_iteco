public class Client extends Person implements Printable, SeasonHandler {

    private int id;

    @Override
    public void eating() {
        wantEat = true;
        System.out.println("Клиент покушал");
    }

    @Override
    public void print() {

    }

    @Override
    public void printVariebles() {
        System.out.println(getId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
