package if_else_loop;

//7. Write a program to print prime numbers from 2 to n

import java.util.Scanner;

public class Prime_Num_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n: ");
        int n = sc.nextInt();
        for (int num = 2; num <=n; num++){
            boolean isPrime = true;
            for (int i = 2; i<=num/2; i++){
                if (num % i == 0){
                    isPrime =false;
                    break;
                }
            }
            if (isPrime == true){
                System.out.println(num);
            }
        }


    }
}
