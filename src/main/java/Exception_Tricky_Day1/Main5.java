package Exception_Tricky_Day1;


class Main5 {

    public static void main(String[] args) {
        try {
            display();
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
            throw new NullPointerException("Child Exception");
        } catch (Exception e) {
            System.out.println("Display Exception");
            throw e;
        }
    }
}