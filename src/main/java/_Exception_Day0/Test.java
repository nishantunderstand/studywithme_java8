package _Exception_Day0;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        display();
    }

    static void display() throws IOException {
        throw new IOException();
    }


    // main || display
    // IOExcepiton + IOException // FINE
    // IOException + Exception ??
    // Exception + IOException ??
    // Exception + Excepiton // FINE



//    static void display() {
//        throw new IOException();
//    }

}


/**
 *  When we throw checked
 *  1. Handle By throws or try-catch block
 */

