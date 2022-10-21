package string_manipulation;

//6. Replace "R" from Rahim with "F" from the given String:
//        Input: Ratul and Rahim lives in Rangpur
//        Output: Ratul and Fahim lives in Rangpur

import java.util.Scanner;

public class Replace_Character_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String userInput = sc.nextLine();
        String replace = userInput.replace("Rah", "Fah");
        System.out.println(replace);

    }
}

