package equation;


public class BadArgsException extends  Exception {


    public BadArgsException() {
    }

    public BadArgsException(String s) {
        super(s);
    }

    public BadArgsException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public BadArgsException(Throwable throwable) {
        super(throwable);
    }
}