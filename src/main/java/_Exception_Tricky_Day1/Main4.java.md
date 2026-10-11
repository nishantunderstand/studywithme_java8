package _Exception_Tricky_Day1;

class Main4 {

    public static void main(String[] args) {
        try {
            display();
        } catch (Exception e) {
            System.out.println("Main Exception");
        } catch (RuntimeException e) {
            System.out.println("Main RuntimeException");
        }
    }

    private static void display() {
        try {
            throw new NullPointerException("Child Exception");
        } catch (RuntimeException e) {
            System.out.println("Display RuntimeException");
            throw e;
        }
    }
}