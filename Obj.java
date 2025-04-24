class Out {
    void fun1() {
        System.out.println("-> This is fun 1");
    }

    void fun2() {
        System.out.println("-> This is fun 2");
    }
}

class Obj {
    public static void main(String[] args) {
        Out object1 = new Out(); // Create object of Out class
        object1.fun1();
        object1.fun2();
    }
}
