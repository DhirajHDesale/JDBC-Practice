/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dhira
 */

import java.sql.*;
public class InsertValues {

   
    public static void main(String[] args) throws Exception{
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","KiranPatil@2001");
        
        PreparedStatement ps = con.prepareStatement("insert into demo values(?,?,?)");
        int id = 23;
        String name = "Amol";
        String email = "amol@gmail.com";
       ps.setInt(1,id);
        ps.setString(2, name);
        ps.setString(3,email);
        
        ps.executeUpdate();
        
        con.close();
    }
    
}
