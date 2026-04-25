package gla.com.jdbc;
import java.sql.*;
public class CustomerDirectory {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS customers(id INT PRIMARY KEY,name VARCHAR(50),phone VARCHAR(15))");

        st.executeUpdate("INSERT INTO customers VALUES(1,'Ravi','9876543210')");

        ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE name LIKE '%Ravi%'");
        while(rs.next()){
            System.out.println(rs.getString(2));
        }

        st.executeUpdate("UPDATE customers SET phone='9999999999' WHERE id=1");

        st.executeUpdate("DELETE FROM customers WHERE id=1");

        con.close();
    }

}
