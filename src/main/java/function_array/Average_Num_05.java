package function_array;

//5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd
//   numbers using these functions: average(), countEvenNumbers(), countOddNumbers()

import java.util.Scanner;

public class Average_Num_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements: ");
        n=sc.nextInt();
        int[] num = new int[5];
        System.out.println("Enter the elements:");
        for (int i = 0; i<n; i++){
            num[i]=sc.nextInt();
        }
        Average_Num_05 numebr = new Average_Num_05();
        numebr.average(num);
        numebr.countEvenNumbers(num);
        numebr.countOddNumbers(num);

    }
    public void average(int[] num){
        double sum = 0;
        for (int i = 0; i<num.length; i++){
            sum += num[i];
        }
        sum = sum/ num.length;
        System.out.println("Average number "+sum);
    }
    public void countEvenNumbers(int[] num){
        int count = 0;
        for (int i = 0; i<num.length; i++){
            if (num[i]%2 == 0){
                count++;
            }
        }
        System.out.println("No of even number is "+count);
    }

    public void countOddNumbers(int[] num){
        int count = 0;
        for (int i = 0; i<num.length; i++){
            if (num[i]%2 != 0){
                count++;
            }
        }
        System.out.println("No of odd numbers: "+count);
    }
}

