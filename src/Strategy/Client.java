package Strategy;

public class Client {
    public static void main(String[] args) {

        GoogleMapsApi googleMapsApi = new GoogleMapsApi();
        googleMapsApi.pathCalculator("Bangalore", "Mysore", TransPortMode.WALK);

    }
}
