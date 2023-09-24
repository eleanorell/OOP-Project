package healy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Patient extends User{
    
    public void Patient(){
        this.adminStatus = 0;
    }
    
    public int saveData(String username, String email, String password){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]SAVE2");
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO users(nama_user, email_user, pw_user, admin_status) VALUES ('"+username+"','"+email+"','"+password+"','"+0+"')";
            stmt.executeUpdate(Query);
            System.out.println("[debug]SAVE3");
            System.out.println(username);
            System.out.println(email);
            System.out.println(password);
            
            return 1;
        }catch(SQLException ex){
            return -1;
        }
       
    }
}
