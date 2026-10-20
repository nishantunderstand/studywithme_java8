package Exception_Tricky_Day1;

class Main7 {

    public static void main(String[] args) {

        try {

            try {
                display();
            } catch (RuntimeException e) {
                System.out.println("Inner Runtime");
                throw new Exception("New Exception");
            }

        } catch (NullPointerException e) {
            System.out.println("Main NPE");

        } catch (RuntimeException e) {
            System.out.println("Main Runtime");

        } catch (Exception e) {
            System.out.println("Main Exception");
        }
    }

    private static void display() {

        try {
            throw new NullPointerException("Original NPE");

        } catch (NullPointerException e) {
            System.out.println("Display NPE");
            throw e;

        } catch (RuntimeException e) {
            System.out.println("Display Runtime");
        }
    }
}