package equation;

public class TrinomialSquare {

    protected  double a;
    protected  double b;
    protected  double c;


    public TrinomialSquare(double a, double b, double c)  throws BadArgsException{
        if(Math.abs(a)<=1e-9){

            throw  new BadArgsException("Не является квадтратным трехчленом");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double[] findRoots() throws NoRootsException {
        double d;
        d = (b*b)-4*a*c;
        if(d<0){
            throw  new NoRootsException("Нет корней");

        }
        d = Math.sqrt(d);
        double[]  result = new double[2];
        result[0] = (-b+d)/2*a;
        result[1] = (-b-d)/2*a;
        return(result);

    }
}