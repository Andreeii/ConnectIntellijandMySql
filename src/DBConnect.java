import java.sql.*;
public class DBConnect {
    public static void main(String[] args) {
        try {
        String host = "jdbc:mysql://localhost:3306/employees";
        String uName = "root";
        String uPass = "secret";
        Connection  con = DriverManager.getConnection(host,uName,uPass);

        Statement stat = con.createStatement();
        String sql = "select * from  workers";
        ResultSet rs = stat.executeQuery(sql);

       while(rs.next()) {
           int id_col = rs.getInt("ID");
           String firs_name = rs.getString("First_Name");
           String last_name = rs.getString("Last_Name");
           String job = rs.getString("JobTitle");
           String p = id_col + " " + firs_name + " " + job;
           System.out.println(p);
       }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
