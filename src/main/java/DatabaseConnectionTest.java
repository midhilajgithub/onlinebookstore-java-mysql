// DatabaseConnectionTest.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://onlinebookstore.cu0jjlm71suc.ap-south-1.rds.amazonaws.com:3306/onlinebookstore";
        String username = "admin";
        String password = "onlinestore";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
