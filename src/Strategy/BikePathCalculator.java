package Strategy;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Calculating bike path from "+source+" to "+destination);

    }
}
