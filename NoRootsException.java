package equation;

public class NoRootsException extends  Exception {


    public NoRootsException() {
    }

    public NoRootsException(String s) {
        super(s);
    }

    public NoRootsException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NoRootsException(Throwable throwable) {
        super(throwable);
    }
}