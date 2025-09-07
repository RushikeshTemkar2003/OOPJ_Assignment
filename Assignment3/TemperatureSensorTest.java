/*
5. Temperature Sensor
Scenario: Sensor should only accept temperatures in safe range.
Problem Statement:
Create a class TemperatureSensor with private temperature. Setter validates range 0–100°C.
Fields:
● private int temperature
Methods:
● setTemperature(int t) → only 0–100 valid
● getTemperature() → return temperature
*/
class TemperatureSensor {
    private int temperature;

    public boolean setTemperature(int t) {
      if (t >= 0 && t <= 100) {
         temperature = t;
         return true;
      } else {
         System.out.println("Temperature out of range");
         return false;
       }
    }

    public int getTemperature() {
        return temperature;
    }
}

public class TemperatureSensorTest {
    public static void main(String[] args) {
      TemperatureSensor sensor = new TemperatureSensor();
      boolean valid = sensor.setTemperature(5);

      
          System.out.println("Temperature = " + sensor.getTemperature());
       }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac TemperatureSensorTest.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java TemperatureSensorTest
Temperature = 5
*/
