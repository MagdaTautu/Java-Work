import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Network {
    private List<Node> nodes;
    public Network(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void setImportance() {
        for (Node node : nodes) {
            if (node instanceof Person) {
                int connections = ((Person) node).relationships.size(); //size() = cate obiecte se afla in map
                ((Person) node).setImportance(connections);
            } else if (node instanceof Company) {
                int connections = ((Company) node).relationships.size();
                ((Company) node).setImportance(connections);
            }
        }
    }
    public void printNetwork() {
        Collections.sort(nodes, Comparator.comparingInt(node -> -getImportance(node))); //lambda expression
//        Collections.sort(nodes,new Comparator<Node>() {
//            public int compare(Node a, Node b) {
//                return b.getName().compareTo(a.getName());
//            }
//        });
        for (Node node : nodes) {
            System.out.println(node.getName() + " (" + getImportance(node) + ")");

        }
    }
    public int getImportance(Node node) {
        if (node instanceof Person) {
            return ((Person) node).importance;
        } else if (node instanceof Company) {
            return ((Company) node).importance;
        } else {
            return 0;
        }
    }

}
