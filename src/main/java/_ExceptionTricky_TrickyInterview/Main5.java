package _ExceptionTricky_TrickyInterview;

import java.io.IOException;

class Main5 {
    public static void main(String[] args) {
        try{
            display();
        }catch(IOException e){
            System.out.println(e.getMessage()+"1");
        }
    }

    public static void display() throws Exception{
        try{
            throw new IOException("Not Found");
        }catch(IOException e){
            System.out.println(e.getMessage()+"3");
        }
    }
}