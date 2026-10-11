package _Exception_Tricky_Day1;


class Main6 {

    public static void main(String[] args) {
        try {
            display();
        } catch (RuntimeException e) {
            System.out.println("Main Runtime");
        } catch (Exception e) {
            System.out.println("Main Exception");
        }
    }

    private static void display() throws Exception {
        try {
            throw new NullPointerException("NPE");
        } catch (Exception e) {
            System.out.println("Display Exception");
            throw new RuntimeException("New Runtime");
        }
    }
}
