package jdbc;

import jdbc.factories.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection connection;

    public int include(String sql, Object... attributes) {
        try {
            PreparedStatement statement = getConnection().prepareStatement(
                    sql, PreparedStatement.RETURN_GENERATED_KEYS
            );
            addAttributes(statement, attributes);
            if (statement.executeUpdate() > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    private void addAttributes(PreparedStatement statement, Object[] attributes) throws SQLException {
        int index = 1;
        for (Object attribute : attributes) {
            if (attribute instanceof String) {
                statement.setString(index, (String) attribute);
            } else if (attribute instanceof Integer) {
                statement.setInt(index, (Integer) attribute);
            }
            index++;
        }
    }

    private Connection getConnection() {
        try {
           if (connection != null && !connection.isClosed()) {
               return connection;
           }
        } catch (SQLException ignored) {

        }
        connection = ConnectionFactory.getConnection();
        return connection;
    }

    public void close() {
        try {
            getConnection().close();
        } catch (SQLException ignored) {

        } finally {
            connection = null;
        }
    }
}
