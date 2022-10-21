package if_else_loop;

//1. Write a program to check if inputted letter is small or capital

import java.util.Scanner;

public class Capital_Small_Letter_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a character");
        char input = scanner.next().charAt(0);
        if(input >= 'A' && input <= 'Z' ){
            System.out.println(input+ " is a capital letter");
        } else if (input >= 'a' && input <= 'z') {
            System.out.println(input+ " is a small letter");
        }
        else {
            System.out.println("Not a character");
        }

    }
}


