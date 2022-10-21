package function_array;

//3. Suppose, in a company , here are some employee salaries in an array
//        [35000, 25000, 28000, 32500, 44000, 32800]
//        Find out the 3rd highest salary

import java.util.Arrays;

public class Highest_Salary_03 {
    public static void main(String[] args) {
        int salary[] = {35000,25000,28000,32500,44000,32800};
        Arrays.sort(salary);
//         for (int i = 0; i<salary.length; i++){
//             System.out.println(salary[i]);
//         }
        int max = salary[salary.length-3];
        System.out.println("3rd highest salary:" +max);
    }
}

