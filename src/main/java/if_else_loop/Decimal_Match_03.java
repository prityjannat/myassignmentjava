package if_else_loop;

//3. Input 2 decimal numbers and check if they are both same or different up to two decimal places.
//        E.g 120.546 & 120.241

import java.util.Scanner;

public class Decimal_Match_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();

        num1 = Math.round(num1*100);
        num2 = Math.round(num2*100);

        if (num1 == num2){
            System.out.println("Both are same number");
        }
        else {
            System.out.println("Different number");
        }
    }
}

