package myClasses_Functions;
import java.util.HashMap;
import java.util.Scanner;
import java.sql.*;



public class CreateUser {

    private final static String url = "jdbc:postgresql://138.197.107.95:5432/group3";
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
        String insertSQL = "INSERT INTO messengerdata.public.usertable(username,password) VALUES(?,?)";
        PreparedStatement AddAUser = null;
        try {
            AddAUser = conn.prepareStatement(insertSQL);
            AddAUser.setString(1, username);
            AddAUser.setString(2, password);
            int rs = AddAUser.executeUpdate();
            System.out.println(rs);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (AddAUser != null) {
                AddAUser.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

//
    }
}






