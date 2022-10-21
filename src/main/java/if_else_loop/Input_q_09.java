package if_else_loop;

//9. Write a program to sum of user input until users input ‘q’ from keyboard

import java.util.Scanner;

public class Input_q_09 {
    public static void main(String[] args) {
        int sum = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        do {
            sum += sc.nextInt();
            System.out.println("Sum of numbers "+sum);
            System.out.println("Do you want to continue y/q");
            ch = sc.next().charAt(0);
        }
        while (ch !='q');
    }
}

