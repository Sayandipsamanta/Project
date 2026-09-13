package Function;

import java.util.Scanner;

public class Palindrome {


  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int act = num;

        int ld=0;
        int rev=0;
        while (num>0) {
            ld=num%10;
            rev=(rev*10)+ld;
            num=num/10;
        }
        if(act==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Non palindrome");
        }
    }
}
