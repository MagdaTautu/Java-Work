package org.example;

import java.sql.*;
import java.util.ArrayList;

public class GenreDAO {
    private Connection connection;

    public void create(String name) throws SQLException {
        Connection con = Database.getConnection();
    }
    public void addGenre(String name) throws SQLException {
        String sql = "INSERT INTO genres (name) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.executeUpdate();
    }
    public void deleteGenre(int id) throws SQLException {
        String sql = "DELETE FROM genres WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from artists where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    public String findById(int id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select name from genres where id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}