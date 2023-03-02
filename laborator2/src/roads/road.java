package roads;
public class road {
    public enum street {
        highway,
        country,
        city
    }
    private street typeofRoad;
    private float length;
    private int limit;
    //constructor:
    public road(street typeofRoad, float length, int limit) {
        this.typeofRoad = typeofRoad;
        this.length = length;
        this.limit = limit;
    }
    //methods:
    public street getTypeofRoad(){
        return typeofRoad;
    }
    public void setTypeofRoad(street type){
        this.typeofRoad=type;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float x){
        this.length=x;
    }
    public int getLimit() {
        return limit;
    }
    public void setLimit(int x)
    {
        this.limit=x;
    }
    @Override
    public String toString(){
        return "Road{"+"type="+typeofRoad+", length="+length+", limit="+limit+"}";
    }
}



