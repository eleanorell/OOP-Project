/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Doctor {
    int id;
    String username;
    String email;
    String password;
    
    public int register(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        System.out.println("[debug]Register");
        System.out.println(username);
        System.out.println(email);
        System.out.println(password);
        
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]SAVE2");
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO doctor(name_doctor, email_doctor, pw_doctor) VALUES ('"+username+"','"+email+"','"+password+"')";
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
    
    public int login(String email, String password){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]BEFORE CHECKING");
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM doctor WHERE email_doctor = '"+email+"'";
            ResultSet rs = stmt.executeQuery(Query);
            System.out.println("[debug]AFTER CHECKING");
            
            rs.next();
            System.out.println(rs.getString("email_doctor"));
            
            this.email = rs.getString("email_doctor");
            this.password = rs.getString("pw_doctor");
            System.out.println("[debug]EMAIL = TRUE");
            
            if(this.password.equals(password)){
                this.id = ((Number)rs.getObject("doctor_id")).intValue();
                this.username = rs.getString("name_doctor");
                System.out.println(this.email);
                System.out.println(this.username);
                System.out.println(this.password);
                System.out.println(this.id);
                return 1;
                
            }else System.out.println("[debug]PASSWORD = FALSE"); return 0;
                
        }catch(SQLException ex){
            System.out.println("[DEBUG] EMAIL NOT FOUND");
            return -1;
            
        }
    }
    
    public String getUsername(int idDoctor){
        try{ 
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM doctor WHERE doctor_id = '"+idDoctor+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println(rs.getString("name_doctor"));
            
            return rs.getString("name_doctor");
        }catch(SQLException ex){
            return "NULL";
        }
    }
}
