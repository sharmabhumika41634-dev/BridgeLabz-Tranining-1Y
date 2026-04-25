package gla.com.jdbc;

import java.sql.*;
public class CourseEnrollment {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS enrollments(id INT PRIMARY KEY,student VARCHAR(50),course VARCHAR(50))");

        st.executeUpdate("INSERT INTO enrollments VALUES(1,'Ankit','Java')");

        ResultSet rs = st.executeQuery("SELECT * FROM enrollments WHERE course='Java'");
        while(rs.next()){
            System.out.println(rs.getString(2));
        }

        st.executeUpdate("UPDATE enrollments SET course='Python' WHERE id=1");

        st.executeUpdate("DELETE FROM enrollments WHERE id=1");

        con.close();
    }
}
