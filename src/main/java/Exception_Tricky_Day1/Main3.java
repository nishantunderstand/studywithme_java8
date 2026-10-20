package Exception_Tricky_Day1;



import java.io.*;

class Main3 {

    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println("Main IOException");
        } catch (Exception e) {
            System.out.println("Main Exception");
        }
    }

    private static void display() throws IOException {
        try {
            throw new IOException("Child Exception");
        } catch (IOException e) {
            System.out.println("Display IOException");
            throw e;
        }
    }
}