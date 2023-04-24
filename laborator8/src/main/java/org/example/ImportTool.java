package org.example;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImportTool {
    private Connection connection;
    public ImportTool(Database db) {
        this.connection=db.getConnection();
//        System.out.println(connection);
    }
    public void importAlbums(String filePath) throws IOException, SQLException {
        List<Album> albums = new ArrayList<>();

        String sql = "INSERT INTO albums (release_year, title, artist, genre) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");
                int year = Integer.parseInt(columns[1].trim());
                String title = columns[2].trim();
                String artist = columns[3].trim();
                String genres = columns[4].trim();

                statement.setInt(1, year);
                statement.setString(2, title);
                statement.setString(3, artist);
                statement.setString(4, genres);
                statement.executeUpdate();
            }
            System.out.println("Albums imported successfully");
        }
    }
}