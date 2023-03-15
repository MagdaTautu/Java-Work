import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();

        Person magda = new Person("Magda", new Date(1990, 1, 15));
        Programmer vlad = new Programmer("Vlad", new Date(1985, 5, 15), "Java");
        Designer razvan = new Designer("Razvan", new Date(1987, 3, 30), "UI/UX");
        Company apple = new Company("Apple");
        Company efix = new Company("Efix");
        Company facebook = new Company("Facebook");

        magda.addRelationship(razvan, "friend");
        magda.addRelationship(vlad, "coworker");
        vlad.addRelationship(magda, "friend");
        vlad.addRelationship(apple, "employee");
        vlad.addRelationship(facebook, "manager");
        razvan.addRelationship(magda, "coworker");
        razvan.addRelationship(efix, "employee");
        razvan.addRelationship(facebook, "employee");
        apple.addRelationship(vlad, "manager");
        efix.addRelationship(razvan, "manager");
        facebook.addRelationship(magda, "manager");
        facebook.addRelationship(vlad, "employee");

        nodes.add(magda);
        nodes.add(vlad);
        nodes.add(razvan);
        nodes.add(apple);
        nodes.add(efix);
        nodes.add(facebook);

        Network network = new Network(nodes);
        network.setImportance();
        network.printNetwork();
    }
}