package gla.com.jdbc;
import java.sql.*;
public class GymManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS members(id INT PRIMARY KEY,name VARCHAR(50),type VARCHAR(20),months INT)");

        st.executeUpdate("INSERT INTO members VALUES(1,'Rohit','Premium',6)");

        ResultSet rs = st.executeQuery("SELECT * FROM members WHERE type='Premium'");
        while(rs.next()){
            System.out.println(rs.getString(2));
        }

        st.executeUpdate("UPDATE members SET months=months+3 WHERE id=1");

        st.executeUpdate("DELETE FROM members WHERE id=1");

        con.close();
    }
}
