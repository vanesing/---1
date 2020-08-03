package J2les2;

public class MyArrayDataExeption extends IllegalArgumentException {
    public MyArrayDataExeption() {
        super();
    }

    public MyArrayDataExeption(String s) {
        super(s);
    }

    public MyArrayDataExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArrayDataExeption(Throwable cause) {
        super(cause);
    }
}
