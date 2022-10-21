package function_array;

//1. Take input from a user and check if the number exists in the array
//        let the array is [1,3,5,7,2,4,6,8]
//        Input: 7
//        Output: Found in the position 3
//        Input: 9
//        Output: Found no element

import java.util.Scanner;

public class Exist_Number_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {1,3,5,7,2,4,6,8};
        System.out.println("Enter a input");
        int input = sc.nextInt();
        boolean found = false;
        int positon = 0;
        for (int i = 0; i<num.length; i++){
            if (num[i] == input){
                found = true;
                positon = i;
                break;
            }
        }
        if (found){
            System.out.println("No of position " +positon);
        }
        else {
            System.out.println("Found no elements");
        }


    }
}

