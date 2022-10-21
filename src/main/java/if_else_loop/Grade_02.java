package if_else_loop;

//2. Write a program to calculate GPA and find grade

import java.util.Scanner;

public class Grade_02 {
    public static void main(String[] args) {
        float[] marks = new float[5];
        float sum = 0 , average;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int subject = sc.nextInt();
        System.out.println("No of subject "+subject);
        System.out.println("Enter marks obtained in 5 subjects: ");
        for ( i = 0; i<5; i++)
        {
            marks[i] = sc.nextFloat();
        }

        for ( i = 0; i<5;i++){
            sum += marks[i];
        }
        System.out.println("Total marks: "+sum);
        average = sum/5;
        System.out.println("Average marks: "+average);
        if (average >= 90) {
            System.out.println("Grade - A+");
        } else if (average < 90 && average >= 85 ) {
            System.out.println("Grade - A");
        } else if (average < 85 && average >= 80) {
            System.out.println("Grade - B+");
        } else if (average < 80 && average >= 75) {
            System.out.println("Grade - B");
        } else if (average < 75 && average >= 70) {
            System.out.println("Grade - C+");
        } else if (average <70 && average >=65) {
            System.out.println("Grade - C");
        } else if (average < 65 && average >=60) {
            System.out.println("Grade - D+");
        } else if (average < 60 && average >= 50) {
            System.out.println("Garde - D");
        } else {
            System.out.println("Grade - F");
        }

    }
}


