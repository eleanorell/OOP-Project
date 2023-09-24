package healy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;
/**
 *
 * @author User
 */
public abstract class User{
    int id;
    String username;
    String email;
    String password;
    int adminStatus;

    public void register(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        System.out.println("[debug]Register");
        System.out.println(username);
        System.out.println(email);
        System.out.println(password);
    }
    
    public int login(String email, String password, int adminstat){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]BEFORE CHECKING");
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM users WHERE email_user = '"+email+"'";
            ResultSet rs = stmt.executeQuery(Query);
            System.out.println("[debug]AFTER CHECKING");
            
            rs.next();
            System.out.println(rs.getString("email_user"));
            int checkAdmin = ((Number)rs.getObject("admin_status")).intValue();
            
            if(adminstat != checkAdmin){
                System.out.println("[debug]WRONG LOGIN PAGE");
                return -2;
                
            }else{
                this.adminStatus = checkAdmin;
                this.email = rs.getString("email_user");
                this.password = rs.getString("pw_user");
                System.out.println("[debug]EMAIL = TRUE");
                if(this.password.equals(password)){
                    this.id = ((Number)rs.getObject("user_id")).intValue();
                    this.username = rs.getString("nama_user");
                    System.out.println(this.email);
                    System.out.println(this.username);
                    System.out.println(this.password);
                    System.out.println(this.id);
                    return 1;
                }else System.out.println("[debug]PASSWORD = FALSE"); return 0;
                
            }
            
        }catch(SQLException ex){
            System.out.println("[DEBUG] EMAIL NOT FOUND");
            return -1;
        }
    }
    
    public int getData(int iduser){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]BEFORE CHECKING");
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM users WHERE user_id = '"+iduser+"'";
            ResultSet rs = stmt.executeQuery(Query);
            System.out.println("[debug]AFTER CHECKING");
            rs.next();
            System.out.println("idUser:"+iduser);
            
            this.id = iduser;
            this.email = rs.getString("email_user");
            this.password = rs.getString("pw_user");
            this.username = rs.getString("nama_user");
            this.adminStatus = 0;
            System.out.println("[debug]DATA INITIALIZED");
            return 1;
            
        }catch(SQLException ex){
            System.out.println("[DEBUG] ID NOT FOUND");
            return -1;
        }
    }
    
}
