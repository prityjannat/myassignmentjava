package string_manipulation;

//8. Write a program to convert each 1st char to uppercase from a string
//        Input: rahim lives in sylhet
//        Output: Rahim Lives in Sylhet

import java.util.Scanner;

public class Uppercase_Letter_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word[] = sentence.split(" ");

        for (int i = 0; i<word.length; i++){
            String firstLetter = String.valueOf(word[i].charAt(0));
            String restLetter = word[i].substring(Integer.parseInt("1"));
            System.out.println(firstLetter.toUpperCase()+ "" +restLetter);
        }




    }
}

