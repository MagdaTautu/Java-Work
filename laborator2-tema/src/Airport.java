public class Airport extends Location{
    private String typeLocation;
    private int numberOfTerminals;
    public Airport(String name, double x, double y, int numberOfTerminals) {
        super(name, x, y);
        this.typeLocation = "Airport";
        this.numberOfTerminals = numberOfTerminals;
    }
    public String getTypeLocation() {
        return typeLocation;
    }
    public int getNumberOfTerminals() {
        return numberOfTerminals;
    }
    public void setNumberOfTerminals(int numberOfTerminals) {
        this.numberOfTerminals = numberOfTerminals;
    }
    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", typeLocation=" + typeLocation +
                ", x=" + x +
                ", y=" + y +
                "}";
    }
}
