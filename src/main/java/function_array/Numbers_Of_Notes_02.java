package function_array;

//2. Input an amount from the user and find out the number of notes from input amount in given array
//        [1000,500,100,50,20,10,5,2,1]
//        Input: 1256
//        Output:
//        1000 1
//        100 2
//        50 1
//        2 3

import java.util.Scanner;

public class Numbers_Of_Notes_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an amount");
        int input = sc.nextInt();
        int[] notes = {1000,500,100,50,20,10,5,2,1};
        int[] countnotes = new int[9];
        for (int i = 0; i<9;i++){
            if (input >= notes[i]){
                countnotes[i] = input / notes[i];
                input = input % notes[i];
            }
        }
        for (int i = 0; i < 9; i++) {
            if (countnotes[i] != 0) {
                System.out.println(notes[i] + " : "
                        + countnotes[i]);
            }
        }
    }
}

