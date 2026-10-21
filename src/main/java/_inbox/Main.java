package _inbox;

public class Main {
    public static void main(String[] args) {
        String str = "Spring Boot Java";
        String[] words = str.split(" "); // Spring   boot java

        StringBuilder sb = new StringBuilder(); //

        for(String word: words){ //
            for(int i=word.length()-1;i>=0;i--){
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}


