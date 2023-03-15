import java.util.*; //pentru Date

public class Person implements Comparable<Person>, Node{
    private String name;
    private Date birthDate;
    public Map<Node, String> relationships;
    public int importance;
    public Person() {
    }
    private Company company;
    Person(String name){
        this.name = name;
        this.relationships = new HashMap<>();
    }
    Person(String name, Date birthDate)
    {
        this.name=name;
        this.birthDate=birthDate;
        this.relationships = new HashMap<>();
    }
    //setters
    public void addRelationship(Node node, String relationship) {
        this.relationships.put(node, relationship);
    }
    public void setImportance(int importance) {
        this.importance = importance;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    //getters
    public Date getBirthDate() {
        return this.birthDate;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
