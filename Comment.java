package healy;


import java.sql.Connection;
import java.sql.DriverManager;
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
public class Comment {
    public int id;
    public String entry;
    public int userId;
    public int forumId;
    
    public int insert(int userId, int forumId, String entry){
        this.entry = entry;
        this.userId = userId;
        this.forumId = forumId;
        System.out.println("[debug]Sent comment");
        System.out.println(userId);
        System.out.println(entry);
        System.out.println(forumId);
        
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]SAVE Commencing");
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO comments(comment_entry, user_id, forum_id) VALUES ('"+entry+"','"+userId+"','"+forumId+"')";
            stmt.executeUpdate(Query);
            System.out.println("[debug]SAVE Complete");
            System.out.println(userId);
            System.out.println(entry);
            System.out.println(forumId);
            
            return 1;
        }catch(SQLException ex){
            return -1;
        }
    }
}
