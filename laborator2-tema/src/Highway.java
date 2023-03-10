public class Highway extends Road{
    private String typeRoad;
    public Highway(String name, double length, double limit, Location a, Location b) {
        super(name, length, limit, a, b);
        this.typeRoad = "Highway";
    }
    public String getTypeRoad() {
        return typeRoad;
    }
    @Override
    public String toString() {
        return "Road{" +
                "name='" + name + '\'' +
                ", typeRoad=" + typeRoad +
                ", length=" + length +
                ", limit=" + limit +
                "}";
    }
}
