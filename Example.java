class Area {
    static void fun1() {
        System.out.println("-> This is Area 1");
    }

    static void fun2() {
        System.out.println("-> This is Area 2 ");
    }
}

class Example {
    static void fun1() {
        System.out.println("-> This is function 1");
    }

    static void fun2() {
        System.out.println("-> This is function 2");
    }

    public static void main(String[] args) {
        System.out.println("Calling Functions:- ");
        fun1();
        fun2();
        Area.fun1();
        Area.fun2();
    }
}
