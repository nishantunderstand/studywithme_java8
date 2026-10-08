package _ExceptionTricky_TrickyInterview;

import java.io.IOException;

class Main2 {
    public static void main(String[] args) {
        try{
            display();
        }catch(Exception e){
            System.out.println(e.getMessage()+"1");
        }
    }

    public static void display() throws IOException{
        try{
            throw new IOException("Not Found");
        }catch(IOException e){
            System.out.println(e.getMessage()+"3");
        }

    }
}