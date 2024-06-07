package Strategy;

public class PathCalculatorFactory {

    public static PathCalculator pathCalculatorFactory(TransPortMode mode) {
        switch (mode){
            case BUS -> {
                return new BusPathCalculator();
            }
            case TRAIN -> {
                return  new TrainPathCalculator();
            }
            case WALK -> {
                return new WalkPathCalculator();
            }
            default -> {
                return new BikePathCalculator();
            }
        }
    }

}
