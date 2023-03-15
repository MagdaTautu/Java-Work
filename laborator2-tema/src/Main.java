public class Main {
    public static void main(String[] args) {

        Homework ex = new Homework(3,2);

        Location loc1 = new City("Iasi", 15.2, 12.9, 45.6);
        ex.addLocation(0, loc1);
        Location loc2 = new Airport("Otopeni", 11.6, 12.0, 8);
        ex.addLocation(1, loc2);
        Location loc3 = new GasStation("OMV", 10.5, 15.4, 3.5);
        ex.addLocation(2, loc3);

        Road road1 = new Country("road 1", 312.32, 56.1, loc1, loc2);
        ex.addRoad(0, road1);
        Road road2 = new Highway("road 2", 292.0, 95.9, loc2, loc3);
        ex.addRoad(1, road2);

        ex.print();
        System.out.println(ex.isInstanceValid());
        if(ex.isInstanceValid()){
            System.out.println(ex.findAPath(loc1, loc3));
        }
    }
}
