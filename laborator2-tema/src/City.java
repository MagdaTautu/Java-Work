public class City extends Location{
    private String typeLocation;
    private double population;
    public City(String name, double x, double y, double population) {
        super(name, x, y);
        this.population = population;
        this.typeLocation = "City";
    }
    public String getTypeLocation() {
        return typeLocation;
    }
    public double getPopulation() {
        return population;
    }
    public void setPopulation(double population) {
        this.population = population;
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
