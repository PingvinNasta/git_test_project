package equation;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class TrinomialSquareTest {

    @org.junit.jupiter.api.Test
    void findRoots_one() throws BadArgsException, NoRootsException {

        TrinomialSquare  test = new TrinomialSquare(1,2,1);

        double[] result = test.findRoots();
        assertEquals(-1, result[0],1e-9);
        assertEquals(-1, result[1],1e-9);
    }


    @org.junit.jupiter.api.Test
    void findRoots_two() throws BadArgsException, NoRootsException {

        TrinomialSquare  test = new TrinomialSquare(1,2,-3);

        double[] result = test.findRoots();
        assertEquals(-3, result[1],1e-9);
        assertEquals(1, result[0],1e-9);
    }

    @org.junit.jupiter.api.Test
    void  findRoots_BadArg()  {
        assertThrows(BadArgsException.class
                , new Executable() {
                    public void execute() throws Throwable {

                        new TrinomialSquare(0, 2, 4);
                    }
                });
    }
    @org.junit.jupiter.api.Test
    void  findRoots_NoRoots()  {
        assertThrows(NoRootsException.class
                , new Executable() {
                    public void execute() throws Throwable {

                        (new TrinomialSquare(1, 2, 4000)).findRoots();
                    }
                });
    }

}