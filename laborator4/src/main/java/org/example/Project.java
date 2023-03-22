package org.example;

public class Project implements Comparable<Project> {
    private String name;
    private boolean assigned;

    public Project(String name) {
        this.name = name;
        this.assigned = false;
    }

    public String getName() {
        return name;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    @Override
    public int compareTo(Project other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

}