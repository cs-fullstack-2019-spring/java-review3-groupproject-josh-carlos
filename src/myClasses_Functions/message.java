package myClasses_Functions;

import java.sql.*;
import java.util.Scanner;

public class message{
    private final static String url = "jdbc:postgresql://138.197.107.95:5432/messengerdata";
    private final static String user = "student";
    private final static String password = "C0d3Cr3w";

//    private Integer mailid;
//    public String subject;
//    public String body;
//    private Integer fromuserid;
//    private Integer sentuserid;
//    private Timestamp datetimesent;

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
        PreparedStatement newMessage = null;
        System.out.println("Who would you like to message?");

        try {
            String insertSQL = "INSERT INTO ccmail(subject, body) VALUES(?,?)";
            newMessage = conn.prepareStatement(insertSQL);
            System.out.println("What is the subject: ");
            String sub = messy.nextLine();
            System.out.println("body: ");
            String bod = messy.nextLine();

            if(sub!=null && bod!=null){
                newMessage.setString(1, sub);
                newMessage.setString(2, bod);
                System.out.println("Message created");
//                System.out.println(password);
                newMessage.executeUpdate();
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

//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(SQL);
//            while (rs.next()){
//                System.out.print(rs.getString(SQL));
//                String input = messy.nextLine();
//                if(input.equals(SQL)){
//                    System.out.println("Testing Testing");
//                }
//            }