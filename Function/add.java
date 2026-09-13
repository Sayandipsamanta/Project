package Function;

import java.util.Scanner;

public class add {
    public static int addNumbers(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first numbers : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        int sum = addNumbers(num1, num2);
        System.out.println("Sum : "+sum);
        
    }
}
