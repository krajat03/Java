class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("-> Sum: " + c.add(5, 4));
        System.out.println("-> Sum: " + c.add(5.2, 4.8));
        System.out.println("-> Sum: " + c.add(5, 4, 2));
    }
}
