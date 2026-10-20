package Exception_Tricky_Day1;

class Main8 {

    public static void main(String[] args) {

        try {
            process();
        } catch (ArithmeticException e) {
            System.out.println("Main Arithmetic");
        } catch (NullPointerException e) {
            System.out.println("Main NPE");
        } catch (RuntimeException e) {
            System.out.println("Main Runtime");
        }
    }

    static void process() {

        try {

            try {
                throw new ArithmeticException("A");

            } catch (ArithmeticException e) {
                System.out.println("Inner Arithmetic");

                try {
                    throw new NullPointerException("B");

                } catch (NullPointerException ex) {
                    System.out.println("Inner NPE");
                    throw ex;
                }

            }

        } catch (ArithmeticException e) {
            System.out.println("Outer Arithmetic");

        } catch (RuntimeException e) {
            System.out.println("Outer Runtime");
            throw e;
        }
    }
}