// 1) We can access a private member by creating its function and then creating its obejct
class Demo {
    private static int a;

    void fun1() {
        a = 5;
        System.out.println("a = " + a);
    }
}

// 2) We can access a private member by creating its static function only, no need to create its object
class Demo2 {
    private static int a;

    static void fun1() {
        a = 6;
        System.out.println("a = " + a);
    }
}

class PrivateMember {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.fun1();

        Demo2.fun1();
    }
}
