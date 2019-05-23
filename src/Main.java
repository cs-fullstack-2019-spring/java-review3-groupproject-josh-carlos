import myClasses_Functions.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner newUser = new Scanner();
        CreateUser x = new CreateUser();
        System.out.println(x);


        System.out.println("Hello World!");
        message blank = new message();
        System.out.println(blank);
        System.out.println();
        try {
            CreateUser.newUser("carlos", "test4321");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
