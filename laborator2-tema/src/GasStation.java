public class GasStation extends Location{
    private String typeLocation;
    private double gasPrice;
    public GasStation(String name, double x, double y, double gasPrice) {
        super(name, x, y);
        this.typeLocation = "Gas Station";
        this.gasPrice = gasPrice;
    }
    public String getTypeLocation() {
        return typeLocation;
    }
    public double getGasPrice() {
        return gasPrice;
    }
    public void setGasPrice(double gasPrice) {
        this.gasPrice = gasPrice;
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
