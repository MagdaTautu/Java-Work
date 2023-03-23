package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Catalog catalog = new Catalog();
        catalog.addDocument(new Document(1,"Document 1","file:///path/to/document1"));
        catalog.addDocument(new Document(2,"Document 2","file:///path/to/document2"));
        System.out.print(catalog.toString());
        catalog.save("catalog.json");
        catalog.removeDocument(1);catalog.removeDocument(2);
        System.out.print("removed docs: \n" + catalog.toString());

        Catalog catalog2 = new Catalog();
        catalog2.addDocument(new Document(3,"Doc1-catalog2","file:///path.."));
        catalog2.addDocument(new Document(4,"Doc2-catalog2","file:///path.."));
        catalog2.save("catalog2.json");
        catalog.load("catalog2.json");
        System.out.print("imported docs from catalog2: \n" + catalog.toString());
        catalog.removeDocument(3);
        System.out.print("removed doc 3: \n" + catalog.toString());
    }
}