package jdbc;


import jdbc.factories.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultPersons2 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM persons WHERE name like ?";
        System.out.print("Enter the value for the research: ");
        String value = scanner.nextLine();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + value + "%");
        ResultSet resultSet = statement.executeQuery();
        List<Person> persons = new ArrayList<>();
        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            persons.add(new Person(id, name));
        }
        for(Person person: persons) {
            System.out.println(person.id() + " ==> " + person.name());
        }
        statement.close();
        connection.close();
        scanner.close();
    }
}
