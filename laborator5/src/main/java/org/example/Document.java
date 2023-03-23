package org.example;

import java.util.HashMap;
import java.util.Map;

public class Document {
    private int id;
    private String name;
    private String path; // local file system path or URL
    private Map<String, String> tags;

    public Document(){}; //for jackson deserialization
    public Document(int id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.tags = new HashMap<>();
    }

    public void addTag(String name, String value) {
        tags.put(name, value);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public Map<String, String> getTags() {
        return tags;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Document{id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", tags=").append(tags);
        sb.append('}');
        return sb.toString();
    }
}
