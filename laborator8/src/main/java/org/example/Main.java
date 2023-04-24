package org.example;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
       Database mydatabase = new Database();
        mydatabase.createConnection();
        ImportTool tool = new ImportTool(mydatabase);
        tool.importAlbums("D:\\Facultate 4\\JAVA\\laborator8\\albumlist.csv");
    }
}