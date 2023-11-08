import java.util.Scanner;

public class greet {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String n=in.next();
     
      System.out.println( intro(n));
    }

    static String intro(String name){
        String a="Hye! myself "+ name;
        return a;
    }
}