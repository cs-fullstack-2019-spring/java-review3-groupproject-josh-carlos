package myClasses_Functions;
import java.util.HashMap;
import java.sql.*;



public class CreateUser {

    HashMap<String, String> users = new HashMap<String, String>();

    public static CreateUser newUser(String username, String password) throws SQLException {
        String insertSQL = "INSERT INTO messengerdata.public.usertable(username,password) VALUES(?,?)";
        Connection conn=null;
        PreparedStatement AddAUser=null;
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
        return null;
    }
}






