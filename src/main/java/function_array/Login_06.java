package function_array;

//6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user
//   inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
//   Let the username: admin, password: admin@123

import java.util.Scanner;

public class Login_06 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin@123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String UserName = sc.next();
        System.out.println("Enter password");
        String Password = sc.next();



        if (UserName.equals(username) && Password.equals(password)){
            System.out.println("login successfull");

        }
        else {
            int i = 0;
            while (i<2){
                if (!Password.equals(password)){
                    System.out.println("Try again");
                    System.out.println("Enter username");
                    UserName = sc.next();
                    System.out.println("Enter password");
                    Password = sc.next();
                    if( UserName.equals(username) && Password.equals(password)) {
                        System.out.println("login successfull");
                        System.exit(0);
                    }
                    i++;
                }
            }
            System.out.println("Your id is locked");
        }


    }
}
