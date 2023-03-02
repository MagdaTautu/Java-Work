import util.location;
import roads.road;
public class Main {
    public static void main(String[] args) {
        location location1 = new location("Bucuresti", location.type.city, 5.5F, 78.1F);
        location location2 = new location("Otopeni", location.type.airport, 421.6F, 582.99F);
        road road1 = new road(road.street.country, 321.7F, 70);
        road road2 = new road(road.street.highway, 1100, 130);

        System.out.println(location1);
        System.out.println(location2);
        System.out.println(road1);
        System.out.println(road2);
    }
}

