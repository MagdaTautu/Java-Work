public class Express extends Road{
    private String typeRoad;
    public Express(String name, double length, double limit, Location a, Location b) {
        super(name, length, limit, a, b);
        this.typeRoad = "Express";
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
