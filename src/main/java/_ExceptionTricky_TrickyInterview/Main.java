package _ExceptionTricky_TrickyInterview;

import java.io.IOException;
class Main {
    public static void main(String[] args) {
        try{
            display();
        }catch(Exception e){
            System.out.println(e.getMessage()+"1");
        }
    }

//    public static void display() throws Exception{
//        try{
//            throw new IOException("Not Found");
//        }catch(IOException e){
//            System.out.println(e.getMessage()+"3");
//        }
//
//    }


    public static void display() throws IOException{
        try{
            throw new IOException("Not Found");
        }catch(IOException e){
            System.out.println(e.getMessage()+"3");
        }

    }
}


// When i throwing a Parent --> Parent , Subclass Accept karo
// Whether i am narrowing or expanding ?


/**
 *
 *
 */