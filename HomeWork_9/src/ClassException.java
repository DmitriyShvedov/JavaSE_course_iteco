public class ClassException extends NumberFormatException {

    private int num;
    private char str;

    public char getStr() {
        return str;
    }

    public int getNum() {
        return num;
    }

    public ClassException(String massage, int a) {
        super(massage);
        this.num = a;
    }

    public ClassException(String massage, char a) {
        super(massage);
        this.str = a;
    }

}
