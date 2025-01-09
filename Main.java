import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    while (!input.equals("q"))
    {
      System.out.println("Input the make of the car, \"default\" to create a default car or \"q\" to quit:");
      input = sc.nextLine();
      if (input.equals("default"))
      {
        Car defaultCar = new Car();
        System.out.println("\n" + defaultCar + "\n"); 
      }
      else
      {
        if (!input.equals("q")) {
          System.out.println("Model of the car: ");
          String model = sc.nextLine();
          System.out.println("Year of the car: ");
          int year = sc.nextInt();
          System.out.println("Miles per gallon of the car: ");
          double mpg = sc.nextDouble();
          sc.nextLine();
          Car customCar = new Car(input, model, year, mpg);
          System.out.println("\n" + customCar + "\n"); 
        
        }
      }
    }
    sc.close();
  }
}
