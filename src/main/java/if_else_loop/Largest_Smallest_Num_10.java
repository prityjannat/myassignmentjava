package if_else_loop;

//10. Write a program to enter the numbers till the user wants and at the end, the program should
//    display the largest and smallest numbers user entered.

import java.util.Scanner;

public class Largest_Smallest_Num_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter the elements of number: ");
        n=sc.nextInt();
        int[] num = new int[n];
        System.out.println("Input the elements");
        for (int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i<num.length; i++){
            if (num[i] > max){
                max = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println("Largest Number is "+max);
        System.out.println("Small number is " +min);


    }
}

