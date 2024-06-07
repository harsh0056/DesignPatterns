package Strategy;

public class TrainPathCalculator implements  PathCalculator
{
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Calculating train path from "+source+" to "+destination);
    }
}
