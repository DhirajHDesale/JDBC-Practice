/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
public class UpdateValues {
    public static void main(String[] args)throws Exception {
          Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","KiranPatil@2001");
        
        PreparedStatement ps = con.prepareStatement("update demo set name=? where id=?");
        String name = "Shubham";
        int id = 23;
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
        con.close();
    }
}
