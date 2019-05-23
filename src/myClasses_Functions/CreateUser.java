package myClasses_Functions;
import java.util.HashMap;
import java.util.Scanner;
import java.sql.*;



public class CreateUser {

    HashMap<String, String> users = new HashMap<String, String>();

    public static void adduser(String[] args)
    {
        try
        {


            String myUrl = "jdbc:postgresql://138.197.107.95:5432/group3";
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            String query = " insert into messengerdata.public.usertable(username, password)"
                    + " values (?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);

            preparedStmt.execute();

            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Error");
            System.err.println(e.getMessage());
        }
    }
}






