public class MethodsMatematical {
    boolean isEven(int a) {
        int result = a % 2;
        boolean b = result == 0;
        return b;
    }

    boolean isOdd(int a) {
        int result = a % 2;
        boolean b = result != 0;
        return b;
    }

    double circleField(double r) {
        final double pi = 3.1415;
        double area = pi * r * r;
        return area;
    }

    int power(int a) {
        return a * a;
    }
}
