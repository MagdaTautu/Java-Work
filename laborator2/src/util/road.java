package util;
public abstract class road {
    protected String name;
    protected double length;
    protected double limit;
    protected location source;
    protected location destination;

    public road(String name, double length, double limit, location a, location b) {
        this.name = name;
        this.length = length;
        this.limit = limit;
        this.source = a;
        this.destination = b;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public location getSource() {
        return source;
    }

    public location getDestination() {
        return destination;
    }
}
