package healy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class Diary {
    int diaryId;
    String diaryTitle;
    String diaryEntry;
    int userId;

    public int insert(String diaryTitle, String diaryEntry, int userId){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]SAVE2");
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO diary(diary_title, diary_entry, user_id) VALUES ('"+diaryTitle+"','"+diaryEntry+"','"+userId+"')";
            stmt.executeUpdate(Query);
            System.out.println("[debug]SAVE3");
            System.out.println(diaryTitle);
            System.out.println(userId);
            
            return 1;
        }catch(SQLException ex){
            return -1;
        }
        
    }
    
    public String getTitle(int diaryId){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM diary WHERE diary_id = '"+diaryId+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("diary_title"));
            
            return rs.getString("diary_title");
        }catch(SQLException ex){
            return "NULL";
        }
    }
    
    public String getEntry(int diaryId){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM diary WHERE diary_id = '"+diaryId+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("diary_entry"));
            
            return rs.getString("diary_entry");
        }catch(SQLException ex){
            return "NULL";
        }
    }
    
}
