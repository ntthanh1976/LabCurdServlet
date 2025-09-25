/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=demodb;encrypt=false";
    private static final String USER = "sa";
    private static final String PASS = "sa";  //hiệu chỉnh theo theo SQL Server của bạn

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("✅ Kết nối SQL Server thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
