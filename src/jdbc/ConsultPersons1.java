package jdbc;

import jdbc.factories.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultPersons1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        String sql = """
                SELECT * FROM persons;
                """;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Person> persons = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            persons.add(new Person(id, name));
        }
        for (Person person: persons) {
            System.out.println(person.id() + " ==> " + person.name());
        }
        statement.close();
        connection.close();
    }
}
