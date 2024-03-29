package jdbc;

import jdbc.factories.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTablePersons {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        String sql = """
                CREATE TABLE IF NOT EXISTS persons(
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(80) NOT NULL
                );
                """;
        Statement stmt = connection.createStatement();
        stmt.execute(sql);
        connection.close();
    }
}
