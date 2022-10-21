package string_manipulation;

//4. Writea program that will give following output:
//        Input: chattogram
//        Output: C8M

import java.util.Scanner;

public class Character_Count_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String first = String.valueOf(input.charAt(0)).toUpperCase();
        String last = String.valueOf(input.charAt(input.length()-1)).toUpperCase();
        int rest = input.length()-2;
        System.out.println(first+rest+last);
    }
}

