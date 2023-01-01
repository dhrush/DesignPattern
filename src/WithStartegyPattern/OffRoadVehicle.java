package WithStartegyPattern;

import WithStartegyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {super( new SportsDriveStrategy());}
}
