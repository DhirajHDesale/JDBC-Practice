/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
public class PrintData {
    public static void main(String[] args)throws Exception {
          Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","KiranPatil@2001");
        
        PreparedStatement ps = con.prepareStatement("select * from demo");
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("email"));
        }
        con.close();
    }
}
