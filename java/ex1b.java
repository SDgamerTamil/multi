import java.util.Scanner;

public class ex1b {

    static class AreaCalculator {

        public double area(double length, double breadth) {
            return length * breadth;
        }

        public double area(double base, double height, int flag) {
            return 0.5 * base * height;
        }

        public int area(int side) {
            return side * side;
        }
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Area of Rectangle: " + calc.area(10.0, 5.0));
        System.out.println("Area of Triangle: " + calc.area(10.0, 6.0, 0));
        System.out.println("Area of Square: " + calc.area(7));
    }
}
