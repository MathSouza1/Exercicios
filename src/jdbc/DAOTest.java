package jdbc;

import jdbc.factories.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOTest {
    public static void main(String[] args) {
        DAO dao = new DAO();
        String sql = "INSERT INTO persons (name, id) VALUES (?, ?)";
        System.out.println(dao.include(sql, "João da Silva", 1000));
        System.out.println(dao.include(sql, "Ana Julia", 1001));
        System.out.println(dao.include(sql, "Djalma Pereira", 1002));

        dao.close();
    }
}
