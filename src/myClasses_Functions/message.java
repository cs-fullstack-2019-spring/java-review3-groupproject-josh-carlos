package myClasses_Functions;

import java.sql.*;
import java.util.Scanner;

public class message{
    private final static String url = "jdbc:postgresql://138.197.107.95:5432/group3";
    private final static String user = "student";
    private final static String password = "C0d3Cr3w";

    private Integer mailid;
    public String subject;
    public String body;
    private Integer fromuserid;
    private Integer sentuserid;
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            messenger(conn);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }


    public static void messenger(Connection conn){
        Scanner messy = new Scanner(System.in);

        System.out.println("Who would you like to message?");

        try {
            String SQL = "SELECT userid FROM messengerdata.public.usertable";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()){
                System.out.print(rs.getString(SQL));
                String input = messy.nextLine();
                if(input.equals(SQL)){
                    System.out.println("Testing Testing");
                }
            }
        }
        catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        connect();
    }

}
//    III. Write a new CCMail
//        (1) Pick user out of existing users
//        (2) Subject
//        (3) Body