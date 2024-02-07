package jdbc;


import jdbc.factories.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPerson {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        Connection connection = ConnectionFactory.getConnection();
        String sql = """
                INSERT INTO persons(
                    name
                )
                VALUES 
                    (?)
                """;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.execute();
        scanner.close();
    }
}
