package bmk_junit4;

public class BMK_JUnit4 {

    public static double myDiv(double a, double b, double x, double d, double c) throws Exception {
        double y;
        if (x <= 5) {
            y = ((a * a * c + b * b - d) / x);
        } else {
            y = (x * x + 5);
        }
        if (!(Double.isNaN(y)) && (!Double.isInfinite(y))) {
            return y;

        } else {
            throw new Exception();
        }
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println(myDiv(7, 5, 5, 167, 3));
    }

}
