package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Catalog {
    private List<Document> documents;

    public Catalog() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void removeDocument(int id) {
        documents.removeIf(document -> document.getId() == id);
    }

    public Document findById(int id) {
        for (Document document : this.documents) {
            if (document.getId() == id) {
                return document;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Document document : this.documents) {
            sb.append(document.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void save(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), this.documents);
    }

    public void load(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        documents = mapper.readValue(new File(fileName), new TypeReference<List<Document>>() {});
    }

    public void readFile(String filename) throws IOException {
        FileReader f = null;
        try{
            f = new FileReader(filename);
            // Read the file character by character
            int c;
            while ((c = f.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            System.err.println("The file " + filename + "is missing!");
        } catch (IOException e) {
            System.out.println("Unexpected error reading the file!");
            e.printStackTrace();
        }finally {
            if (f != null) { // Close the file
                try {
                    f.close();
                } catch (IOException e) {
                    System.err.println("Error closing the file!");
                }
            }

            // Close the file
        f.close();
    }

    }

}
