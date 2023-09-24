package healy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Thread {
    int threadId;
    String threadTitle;
    String threadEntry;
    int userId;

    public int insert(String threadTitle, String threadEntry, int userId){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]SAVE2");
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO forum(thread_title, thread_entry, user_id) VALUES ('"+threadTitle+"','"+threadEntry+"','"+userId+"')";
            stmt.executeUpdate(Query);
            System.out.println("[debug]SAVE3");
            System.out.println(threadTitle);
            System.out.println(userId);
            
            return 1;
        }catch(SQLException ex){
            return -1;
        }
    }
    
    public String getTitle(int threadId){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM forum WHERE forum_id = '"+threadId+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("thread_title"));
            
            return rs.getString("thread_title");
        }catch(SQLException ex){
            System.out.println("Error getting title");
            return "NULL";
        }
    }
    
    public String getEntry(int threadId){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM forum WHERE forum_id = '"+threadId+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("thread_entry"));
            
            return rs.getString("thread_entry");
        }catch(SQLException ex){
            return "NULL";
        }
    }
    
    public String getUsername(int threadId){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT forum.forum_id, users.nama_user FROM forum INNER JOIN users ON forum.user_id = users.user_id WHERE forum_id = '"+threadId+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("nama_user"));
            
            return rs.getString("nama_user");
        }catch(SQLException ex){
            System.out.println("Error getting name");
            return "NULL";
        }
    }
    
    public int deleteThread(int idThread){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "DELETE FROM forum WHERE forum_id = '"+idThread+"'";
            stmt.executeUpdate(Query);
            
            return 1;
        }catch(SQLException ex){
            return -1;
        }
    }
}
