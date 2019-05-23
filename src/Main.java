import myClasses_Functions.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner promptUser = new Scanner(System.in);
        CreateUser x = new CreateUser();
        System.out.println(x);
//        String test = promptUser.next();


        System.out.println("Hello World!");
        message blank = new message();
        System.out.println(blank);
        System.out.println();
//        try {
            System.out.println("Enter username: ");
            String test = promptUser.nextLine();
            System.out.println(test);
//            CreateUser user2 = CreateUser.newUser("carlos", "test4321");
//            CreateUser user1 = CreateUser.newUser("Thaddeus", "Blue");
//            System.out.println(user1);
//            System.out.println(user2);
//            System.out.println(CreateUser.newUser("theo","good"));

//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
