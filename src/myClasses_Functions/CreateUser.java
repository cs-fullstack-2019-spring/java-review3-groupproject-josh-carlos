package myClasses_Functions;
import java.util.HashMap;
import java.util.Scanner;
import java.sql.*;



public class CreateUser {

    private final static String url = "jdbc:postgresql://138.197.107.95:5432/messengerdata";
    private final static String username = "student";
    private final static String password = "C0d3Cr3w";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            newUser(conn);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    HashMap<String, String> users = new HashMap<String, String>();

    public static void newUser( Connection conn) throws SQLException {
        Scanner promptUser = new Scanner(System.in);
//        String username="";
//        String password="";
        String insertSQL = "INSERT INTO usertable(username,password) VALUES(?,?)";
        PreparedStatement AddAUser = null;
        try {
            AddAUser = conn.prepareStatement(insertSQL);
            System.out.println("Enter username: ");
            String test1 = promptUser.nextLine();
            System.out.println("Enter password: ");
            String test2 = promptUser.nextLine();

            if(test1!=null && test2!=null){
                AddAUser.setString(1, test1);
                AddAUser.setString(2, test2);
                System.out.println("You are now registered "+test1);
//                System.out.println(password);
                AddAUser.executeUpdate();
            }
            else{
                System.out.println("Error");
            }
//            System.out.println(test1);
//            int rs = AddAUser.executeUpdate();
//            System.out.println(rs);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (AddAUser != null) {
                AddAUser.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    connect();
//
    }
}





