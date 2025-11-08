class Outer {
    void display() {
        final int x = 10; // effectively final

        // Local inner class inside method
        class LocalInner {
            void show() {
                System.out.println("x = " + x);
            }
        }

        LocalInner obj = new LocalInner();
        obj.show();
    }
}

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
