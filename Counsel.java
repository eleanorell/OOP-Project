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
public class Counsel {
    int id;
    String title;
    String problem;
    String solution;
    int userId;
    int doctorId;
    
    public int insert(String title, String problem, int userId){
        this.title = title;
        this.problem = problem;
        this.userId = userId;
        
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]SAVE Commencing");
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO counseling(title, problem, user_id) VALUES ('"+title+"','"+problem+"','"+userId+"')";
            stmt.executeUpdate(Query);
            System.out.println("[debug]SAVE Complete");
            System.out.println(title);
            System.out.println(userId);
            
            return 1;
        }catch(SQLException ex){
            return -1;
        }
    }
    
    public String getTitle(int idCounsel){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM counseling WHERE counseling_id = '"+idCounsel+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("title"));
            
            return rs.getString("title");
        }catch(SQLException ex){
            System.out.println("[DEBUG] Error getting title");
            return "NULL";
        }
    }
    
    public int getStatus(int counselId){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM counseling WHERE counseling_id = '"+counselId+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("solution"));
            
            if(rs.getString("solution") == null){
                return -1;
            }else return 1;
        }catch(SQLException ex){
            return -1;
        }
    }
    
    public String getProblem(int idCounsel){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM counseling WHERE counseling_id = '"+idCounsel+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("problem"));
            
            return rs.getString("problem");
        }catch(SQLException ex){
            return "NULL";
        }
    }
    
    public String getSolution(int idCounsel){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM counseling WHERE counseling_id = '"+idCounsel+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("solution"));
            
            return rs.getString("solution");
        }catch(SQLException ex){
            return "NULL";
        }
    }
    
    public String getUsername(int idCounseling){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT counseling.counseling_id, users.nama_user FROM counseling INNER JOIN users ON counseling.user_id = users.user_id WHERE counseling_id = '"+idCounseling+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("nama_user"));
            
            return rs.getString("nama_user");
        }catch(SQLException ex){
            System.out.println("[DEBUG]Error getting name");
            return "NULL";
        }
    }
    
    public String getDoctorName(int idCounseling){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT counseling.counseling_id, doctor.doctor_id, doctor.name_doctor FROM counseling INNER JOIN doctor ON counseling.doctor_id = doctor.doctor_id WHERE counseling_id = '"+idCounseling+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("name_doctor"));
            
            return rs.getString("name_doctor");
        }catch(SQLException ex){
            return "NULL";
        }
    }
    
    public int update(String answer, int idDoctor, int idCounseling){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "UPDATE counseling SET solution = '"+answer+"', doctor_id = '"+idDoctor+"' WHERE counseling_id = '"+idCounseling+"'";
            stmt.executeUpdate(Query);
            
            return 1;
        }catch(SQLException ex){
            return -1;
        }
    }
}
