class Member {
    int a;
    int b;
}

class NonStaticMember {
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.a = 5;
        System.out.println(m1.a);
        System.out.println(m1.b); // Output-> 0 (no value has given to b)
    }
}
