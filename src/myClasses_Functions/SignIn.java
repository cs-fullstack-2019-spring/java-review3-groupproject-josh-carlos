package myClasses_Functions;

import java.sql.*;
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
        try {
            String SQL = "SELECT username, password FROM usertable";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {

//            String username, password;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter username:");
            String inputUsername = s.nextLine();
            System.out.println("Enter password:");
            String inputPassword = s.nextLine();
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                rs.getString(SQL);
                System.out.println("Successful");

                }
            else {
                System.out.println("Failed to Login");
                }
        }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    connect();
    }
}

//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(SQL);
//            while (rs.next()){
//                System.out.print(rs.getString(SQL));
//                String input = messy.nextLine();
//                if(input.equals(SQL)){
//                    System.out.println("Testing Testing");
//                }
//            }