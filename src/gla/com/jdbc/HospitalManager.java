package gla.com.jdbc;
import java.sql.*;
public class HospitalManager {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS patients(id INT PRIMARY KEY,name VARCHAR(50),disease VARCHAR(50))");

        st.executeUpdate("INSERT INTO patients VALUES(1,'Mohit','Fever')");

        ResultSet rs = st.executeQuery("SELECT * FROM patients WHERE disease='Fever'");
        while(rs.next()){
            System.out.println(rs.getString(2));
        }

        st.executeUpdate("UPDATE patients SET disease='Cold' WHERE id=1");

        st.executeUpdate("DELETE FROM patients WHERE id=1");

        con.close();
    }
}
