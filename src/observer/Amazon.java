package observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private  List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    public static Amazon amazonInstance = null;

    public static Amazon getInstance() {
        if (amazonInstance == null) {

            synchronized (Amazon.class){
                amazonInstance = new Amazon();
            }

        }
        return amazonInstance;
    }

    public void registerOnOrderPlaced(OrderPlacedSubscriber subscriber) {

        orderPlacedSubscribers.add(subscriber);

    }

    public void deRegisterOnOrderPlaced(OrderPlacedSubscriber subscriber) {
            orderPlacedSubscribers.remove(subscriber);
    }


    public void orderPlaced() {
        orderPlacedSubscribers.forEach(OrderPlacedSubscriber::onOrderPlaced);
    }



}
