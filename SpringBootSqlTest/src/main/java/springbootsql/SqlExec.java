package springbootsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlExec {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");

            System.out.print("Connecting to DB...");
            conn = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/mysql", "root", "");
            System.out.println("done.");

            stmt = conn.createStatement();
            String sql = "SELECT code,name from sampledb.employees";
            ResultSet hrs = stmt.executeQuery(sql);

            while (hrs.next()) {
                String code = hrs.getString(1);
                String name = hrs.getString(2);
                System.out.println("社員コード: " + code + " 名前: "+ name);
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Good bye!");
    }
}