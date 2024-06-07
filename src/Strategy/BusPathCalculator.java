package Strategy;

public class BusPathCalculator implements PathCalculator{

    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Calculating bus path from "+source+" to "+destination);
    }
}
