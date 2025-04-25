class OuterClass {
    protected class ProtectedInner {
        void display() {
            System.out.println("\n-> This is Protected Inner class\n");
        }

    }

    public void accessProtectedInner() {
        ProtectedInner obj = new ProtectedInner();
        obj.display();
    }

}

public class ProtectedClass {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        obj1.accessProtectedInner();
    }
}
