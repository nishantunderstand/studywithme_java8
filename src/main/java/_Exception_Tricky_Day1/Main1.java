package _Exception_Tricky_Day1;

import java.io.*;

class Main1 {
    public static void main(String[] args) {
        try {
            display();
        } catch (Exception e) {
            System.out.println("Main Catch");
        }
    }

    private static void display() throws IOException {
        try {
            throw new IOException("Child Exception");
        } catch (Exception e) {
            System.out.println("Display Catch");
        }
    }
}