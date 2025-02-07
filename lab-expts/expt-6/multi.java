public class multi {
    public int multiply(int a, int b) {
        return a * b;
    }
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double multiply(int a, double b) {
        return a * b * c;
    }
    public double multiply(double a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        multi multiplication = new multi();
        int result1= multiplication.multiply(5, 3);
        System.out.println("Multiplication of two integers: " + result1);
        int result2 = multiplication.multiply(2,3,4);
        System.out.println("Multiplication of three integers: " + result2);
        double result3 = multiplication.multiply(5.5, 4.5);
        System.out.println("Multiplication of two doubles: " + result3);
        double result4 = multiplication.multiply(5, 4.5);
        System.out.println("Multiplication of an integer and a double: " + result4);
        double result5 = multiplication.multiply(5.5, 4);
        System.out.println("Multiplication of a double and an integer: " + result5);
    }    
}
