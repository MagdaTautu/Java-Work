package org.example;

import java.sql.*;

public class AlbumDAO {
    private Connection connection;

    public void create(String name) throws SQLException {
        Connection con = Database.getConnection();
    }
    public void addAlbum(int release_year, String title, String artist ) throws SQLException {
        String sql = "INSERT INTO albums (release_year, title, artist) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, release_year);
        statement.setString(2, title);
        statement.setString(3, artist);
        statement.executeUpdate();
    }
    public void deleteAlbum(int id) throws SQLException {
        String sql = "DELETE FROM albums WHERE id = ?";
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
             ResultSet rs = stmt.executeQuery("select title from albums where id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}