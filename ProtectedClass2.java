class OuterClass {
    protected class ProtectedInner {
        void display() {
            System.out.println("\n-> This is Protected Inner class\n");
        }
    }
}

public class ProtectedClass2 {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        OuterClass.ProtectedInner objInner = obj1.new ProtectedInner();
        objInner.display();
    }
}
