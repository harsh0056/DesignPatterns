package Strategy;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Calculating walk path from "+source+" to "+destination);

    }
}
