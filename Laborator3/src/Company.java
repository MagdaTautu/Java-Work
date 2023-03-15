import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Company implements Comparable<Company>,Node {
    private final String name;

    private Map<Person, String> persons;
    public int importance;
    //specific property
    public int foundedYear; //anul in care s-a infiintat compania
    public Map<Node, String> relationships;
    Company(){
        this.name = new String();
        this.persons = new HashMap<>();
        this.relationships = new HashMap<>();
    }
    Company(String name)
    {
        this.persons = new HashMap<>();
        this.name = name;
        this.foundedYear = 0; //default
        this.relationships = new HashMap<>();
    }
    Company(String name, int year)
    {
        this.name = name;
        this.foundedYear=year;
        this.relationships = new HashMap<>();
    }
    public String getName()
    {
        return this.name;
    }
    public int getFoundedYear()
    {
        return this.foundedYear;
    }
    public void setFoundedYear(int year){
        this.foundedYear=year;
    }
    public void addEmployee(Person p, String position){

        this.persons.put(p, position);
        p.setCompany(this);
    }
    public void setImportance(int importance) {
        this.importance = importance;
    }

    public void addRelationship(Node node, String relationship) {
        this.relationships.put(node, relationship);
    }
    @Override
    public int compareTo(Company other) {
        return this.name.compareTo(other.name);
    }
}
