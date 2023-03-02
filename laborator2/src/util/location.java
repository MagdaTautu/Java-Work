package util;
public class location {
    public enum type{
        city,
        airport,
        gasStation
    }
    private String name;
    private type typeOfLocation;
    private float x;
    private float y;

    public location() { }
    public location(String name) {
        this.name = name;
    }
    public location(String name,type typeLocation, float x, float y){
        this.name = name;
        this.typeOfLocation = typeLocation;
        this.x = x;
        this.y = y;
    }
    //methods:
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public type getTypeLocation() {
        return typeOfLocation;
    }
    public void setTypeLocation(type typeLocation) {
        this.typeOfLocation = typeLocation;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
}
