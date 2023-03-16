package util;
public abstract class location extends Object{
    protected String name;
    protected double x;
    protected double y;
    public location(String name, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    @Override
    public abstract String toString();

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null || !(obj instanceof Location)) {
//            return false;
//        }
//        Location other = (Location) obj;
//        return (name.equals(other.name) && x == other.x && y == other.y);
//    }
}
