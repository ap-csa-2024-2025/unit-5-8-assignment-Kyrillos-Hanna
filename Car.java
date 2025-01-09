public class Car
{
  private String Make;
  private String Model;
  private int Year;
  private double MPG;
  private int carID;
  private static int numCars;
  
  public Car() {
    Make = "None";
    Model = "None";
    Year = 2000;
    MPG = 0;
    numCars++;
    carID = numCars;
  }

  public Car(String make, String model, int year, double mpg) {
    Make = make;
    Model = model;
    Year = year;
    MPG = mpg;
    numCars++;
    carID = numCars;
  }

  public String toString() {
    return "ID: " + carID + "\nMake: " + Make + "\nModel: " + Model + "\nYear: " + Year + "\nMPG: " + MPG;
  }

}
