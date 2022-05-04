public abstract class Person {
    private String firstName;
    private String secondName;
    boolean wantEat = true;
    private int id;

    public abstract void eating();
    public abstract void wantEating();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
