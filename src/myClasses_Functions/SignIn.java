package myClasses_Functions;

import java.util.Scanner;

public class SignIn {
    public static void login(String args[])
    {
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();
        System.out.print("Enter password:");
        password = s.nextLine();
        if(username.equals("user") && password.equals("user"))
        {
            System.out.println("Successful");
        }
        else
        {
            System.out.println("Failed to Login");
        }
    }
}
