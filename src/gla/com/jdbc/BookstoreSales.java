package gla.com.jdbc;
import java.sql.*;
public class BookstoreSales {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS sales(id INT PRIMARY KEY,bookName VARCHAR(100),quantity INT,price DOUBLE)");

        st.executeUpdate("INSERT INTO sales VALUES(1,'Java Book',2,500)");

        ResultSet rs = st.executeQuery("SELECT * FROM sales WHERE quantity>1");
        while(rs.next()){
            System.out.println(rs.getString(2));
        }

        st.executeUpdate("UPDATE sales SET quantity=5 WHERE id=1");

        st.executeUpdate("DELETE FROM sales WHERE id=1");

        con.close();
    }
}
