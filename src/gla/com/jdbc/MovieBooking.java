package gla.com.jdbc;
import java.sql.*;
public class MovieBooking {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS movies(id INT PRIMARY KEY,name VARCHAR(50),seats INT)");

        st.executeUpdate("INSERT INTO movies VALUES(1,'Avengers',50)");

        ResultSet rs = st.executeQuery("SELECT * FROM movies WHERE seats>0");
        while(rs.next()){
            System.out.println(rs.getString(2));
        }

        st.executeUpdate("UPDATE movies SET seats=seats-1 WHERE id=1");

        st.executeUpdate("DELETE FROM movies WHERE id=1");

        con.close();
    }
}
