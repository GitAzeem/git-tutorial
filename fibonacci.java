package asssignmentPRACTICE;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int p = 0;
        int i = 1;
        int count= 2;
        while(count<= n){
            int temp = i;
            i = p+i;
            p=temp;
        }


        System.out.println(i);

    }
}
