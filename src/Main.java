
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        double result = calculator.calculateSumOfPowers();
        System.out.println("Rezultatul este: " + result);


        MatrixDataHandler mH = new MatrixDataHandler(5, 7, "matrix.txt");
        mH.modifyValueAndUpdateFile("matrix.txt", 3, 4, 345);
    }
}
