package if_else_loop;

//6. Write  a program to find the factorial of a given number

import java.util.Scanner;

public class Factorial_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int num = sc.nextInt();
        int sum = 1;
        for (int i=1; i <= num; i++){
            sum *= i;
        }
        System.out.println(sum);
    }
}

