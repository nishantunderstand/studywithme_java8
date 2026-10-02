package __inbox;

interface B {
    default void show() {
        System.out.println("B");
    }
}
interface C {
    default void show() {
        System.out.println("C");
    }
}
class D implements B, C {

    @Override
    public void show() {
        B.super.show();   // explicitly choose B
    }
}
// Case 1 : You don't resolve it : Compile time Error
// Case 2 : You resolve it, You mentioned it.