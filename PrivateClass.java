class OuterClass {
    private class PrivateInner {
        void display() {
            System.out.println("\n-> This is Private Inner class\n");
        }

    }

    public void accessPrivateInner() {
        PrivateInner obj = new PrivateInner();
        obj.display();
    }

}

public class PrivateClass {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        obj1.accessPrivateInner();
    }
}
