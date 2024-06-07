package Strategy;

public class GoogleMapsApi {

//    private PathCalculator pathCalculator;
//
//    public GoogleMapsApi(PathCalculator pathCalculator){
//        this.pathCalculator = pathCalculator;
//
//    }


    public void pathCalculator(String source, String destination, TransPortMode transPortMode){

        PathCalculator pathCalculator = PathCalculatorFactory.pathCalculatorFactory(transPortMode);

        pathCalculator.calculatePath(source, destination);
    }

}
