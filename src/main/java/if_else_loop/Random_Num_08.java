package if_else_loop;

//8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input
//   and match it with any of the random numbers. If correct give it 1 point and if incorrect,
//   do not give it any point. Finally, repeat this for 10 times and count the point user achieved.

import java.util.Scanner;

public class Random_Num_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = (int)Math.round(Math.random()*10);
        double num2 = (int)Math.round(Math.random()*10);

        int count = 0;
        for (int i = 0; i<10; i++){
            System.out.println("Enter a number");
            int input = sc.nextInt();
            if (input == num1 || input == num2){
                count++;
            }
        }
        System.out.println("Total point: "+count);

    }
}

