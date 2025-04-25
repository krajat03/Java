// Access private instance member by creating its function
class Demo {
    private int a;

    void fun1() {
        a = 5;
        System.out.println("a = " + a);
    }
}

class InstanceMember {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.fun1();
    }

}
