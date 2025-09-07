/*
22. Vehicle Types
Scenario: Vehicles can be Land or Water types. Some vehicles can operate on both.
Problem Statement:
● Interface LandVehicle → method driveOnLand()
● Interface WaterVehicle → method driveOnWater()
● Class AmphibiousVehicle implements both interfaces → provides both methods
*/
interface LandVehicle {
    void driveOnLand();
}

interface WaterVehicle {
    void driveOnWater();
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    private String name;

    public AmphibiousVehicle(String name) {
       this.name = name;
    }

    @Override
    public void driveOnLand() {
      System.out.println(name + " = Driving on Land");
    }

    @Override
    public void driveOnWater() {
      System.out.println(name + " = Driving on Water");
    }
}

public class VehicleTypes22 {
    public static void main(String[] args) {
      AmphibiousVehicle av = new AmphibiousVehicle("HydroCar");
      av.driveOnLand();
      av.driveOnWater();
    }
}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac VehicleTypes22.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java VehicleTypes22
HydroCar = Driving on Land
HydroCar = Driving on Water
*/