package Function;

import java.util.Scanner;

public class findExtremeDifference {
    public static void main(String[] args) {
        System.out.println("Enter the number of element in the array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];      

        System.out.println("Enter "+size+ " Elements ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        if(size==0 || numbers.length<2){
            return ;
        }

        for(int i=1; i<size; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }

        for(int i=1; i<size; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        int diff = (max-min);
        System.out.println("The difference is "+diff);
        
    }
}
