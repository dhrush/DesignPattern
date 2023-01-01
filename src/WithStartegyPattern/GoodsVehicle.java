package WithStartegyPattern;

import WithStartegyPattern.Strategy.NormalDriveStrategy;
import WithoutStrategyPattern.NormalVehicle;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle() {super(new NormalDriveStrategy());}
}
