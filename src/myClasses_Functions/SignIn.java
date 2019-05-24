package myClasses_Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SignIn {

    private final static String url = "jdbc:postgresql://138.197.107.95:5432/messengerdata";
    private final static String username = "student";
    private final static String password = "C0d3Cr3w";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            login(conn);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }


    public static void login(Connection conn) {

        String username,  password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();
        System.out.print("Enter password:");
        password = s.nextLine();
        if (username.equals("user") && password.equals("user")) {
            System.out.println("Successful");
        } else {
            System.out.println("Failed to Login");
        }
    connect();
    }
}