package if_else_loop;

//5. Write a program to sum of numbers which only divisible by 5 from 1 to 100

public class Divisible_By_5_05 {
    public static void main(String[] args) {
        int sum = 0;
        for ( int i = 1; i <= 100; i++) {
            if (i%5 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum of numbers "+sum);
    }
}