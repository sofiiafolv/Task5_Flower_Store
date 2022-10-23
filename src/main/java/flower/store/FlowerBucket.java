package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flbucket = new ArrayList<FlowerPack>();
    public void add(FlowerPack flpack) {
        flbucket.add(flpack);
    }
    public double getPrice() {
        double sum = 0;
        for (int i = 0; i < flbucket.size(); ++i) {
            sum += flbucket.get(i).getPrice();
        }
        return sum;
    }
}
