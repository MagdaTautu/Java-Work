public class Homework {
    private Location[] locations;
    private Road[] roads;
    public Homework(int n, int m){
        this.locations = new Location[n];
        this.roads = new Road[m];
    }
    public void addLocation(int position, Location element){
        for(int i = 0; i < position; i++ ){
            if(element.getName().equals(locations[i].getName())) {
                throw new IllegalArgumentException("Location name already exists");
            }
            if(element.getX() == locations[i].getX()) {
                throw new IllegalArgumentException("Location: X coordinates already exists");
            }
            if(element.getY() == locations[i].getY()) {
                throw new IllegalArgumentException("Location: Y coordinates already exists");
            }
        }
        locations[position] = element;
    }
    public void addRoad(int position, Road element){
        for(int i = 0; i < position; i++ ){
            if(element.getName().equals(roads[i].getName())) {
                throw new IllegalArgumentException("Road name already exists");
            }
        }
        if (element.getLimit() < 0) {
            throw new IllegalArgumentException("Error: LimitRoad is negative");
        }
        if (element.getSource().equals(element.getDestination())) {
            throw new IllegalArgumentException("Error: The source is the same as the destination");
        }
        roads[position] = element;
    }
    public void print(){
        for(int i = 0; i < locations.length; i++){
            System.out.println(locations[i]);
        }
        System.out.println();
        for(int i = 0; i < roads.length; i++){
            System.out.println(roads[i]);
        }
    }
    public boolean isInstanceValid() {
        for (Road road : roads) {
            if (road == null ) {
                return false;
            }
        }
        for (Location location : locations) {
            if ( location == null ) {
                return false;
            }
        }
        return true;
    }
    public boolean findSourceDestination(Location destinationElem){
        for (Road road : roads) {
            if(road.getSource().getName().equals(destinationElem.getName())){
                return true;
            }
        }
        return false;
    }
    public boolean findAPath(Location source, Location destination) {
        for (Road road : roads) {
            if (road.getSource().equals(source) && road.getDestination().equals(destination)){
                return true;
            }
            if(road.getSource().equals(source) && findSourceDestination(road.getDestination())){
                return findAPath(road.getDestination(), destination);
            }
        }
        return false;
    }
}

