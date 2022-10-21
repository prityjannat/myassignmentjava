package if_else_loop;

//4. Write a program to check balance and withdraw money from ATM booth using if else or switch case

import java.util.Scanner;

public class ATM_booth_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 20000 ;
        while (true){
            System.out.println("Choose option 1 for check balance");
            System.out.println("Choose option 2 for withdraw money");
            System.out.println("Choose option 3 for check balance after transaction");
            System.out.println("Choose option 4 to exit the system");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is "+balance);
                    break;
                case 2:
                    System.out.println("Enter your withdraw money: ");
                    int withdraw = sc.nextInt();
                    if (balance >= withdraw){
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else {
                        System.out.println("you don't have sufficient balance");
                    }
                    break;
                case 3:
                    System.out.println("Your current balance is "+balance+ " after transaction");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}


