package gla.com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "password");

            System.out.println("Database Connected!");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
