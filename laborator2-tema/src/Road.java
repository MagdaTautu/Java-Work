
public abstract class Road{
    protected String name;
    protected double length;
    protected double limit;
    protected Location source;
    protected Location destination;
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public Road(String name, double length, double limit, Location a, Location b){
        if(euclideanDistance(a.getX(), a.getY(), b.getX(), b.getY()) > length) {
            System.out.println("Lungimea drumului este prea mica");
        } else {
            this.name = name;
            this.length = length;
            this.limit = limit;
            this.source = a;
            this.destination = b;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLimit(){
        return limit;
    }
    public void setLimit(double limit){
        this.limit = limit;
    }
    public Location getSource() {
        return source;
    }
    public Location getDestination() {
        return destination;
    }
    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Road)) {
            return false;
        }
        Road other = (Road) obj;
        return (name.equals(other.name) && source.equals(other.source) && destination.equals(other.destination));
    }
}
