public class ConsOverloading {
    int a, b, c, d, e;

    ConsOverloading() {}
    ConsOverloading(int a) {
        this.a = a;
        System.out.println("Constructor Overloading");
        System.out.println("Value of A = " + a);
    }

    ConsOverloading(int a, int b) {
        this.a = a;
        this.b = b;
        d = this.a + this.b;
        System.out.println("Adding two numbers: " + d);
    }

    ConsOverloading(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        e = this.a + this.b + this.c;
        System.out.println("Adding three numbers: " + e);
    }

    public static void main(String[] args) {
        ConsOverloading demo = new ConsOverloading();
        ConsOverloading demo2 = new ConsOverloading(10);
        ConsOverloading demo3 = new ConsOverloading(3, 6);
        ConsOverloading demo4 = new ConsOverloading(2, 3, 5);
    }
}
