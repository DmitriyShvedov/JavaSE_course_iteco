public class Main {
    public static void main(String[] args) {

        Client client1 = new Client();
        Employee employee1 = new Employee();

        client1.setId(1);
        client1.printVariebles();

        employee1.setId(2);
        employee1.printVariebles();

        client1.eating();
        employee1.eating();

        client1.print();
        employee1.print();

        client1.wantEating();
    }
}
