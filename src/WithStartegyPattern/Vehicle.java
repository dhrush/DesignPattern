package WithStartegyPattern;


import WithStartegyPattern.Strategy.DriveStrategy;

public class Vehicle {

    //Class Vehicle has a DriveStrategy
    DriveStrategy driveObj;

    //this is constructor injection
    public Vehicle(DriveStrategy ob) {
        this.driveObj = ob;
    }

    public void drive() {
        driveObj.drive();
    }
}
