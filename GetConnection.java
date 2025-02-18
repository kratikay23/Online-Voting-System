/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Election;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Corrected syntax
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voterproject?useSSL=false&allowPublicKeyRetrieval=true", "root", "Kratik@23"); // Replace with your DB credentials
            System.out.println("Database connected...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
