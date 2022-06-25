package src;
public class FivePlanetTravel {
  /*
   * NumPlanets = total planets to traverse
   * Velocity = travel velocity(mp/h)
   */
  public static int NumPlanets = 5, Velocity = 670616629;

  static double CalculateTime(final int planetDistance) {
    return (double) planetDistance / Velocity;
  } 

  public static void main(String[] args)
  {
    // planet distances from: https://theplanets.org/
    final int[] planetArray = {
      56974146, // Mercury
      25724767, // Venus
      48678219, // Mars
      390674710,// Jupiter
      792248270 // Saturn
    };

    // total travel time(Hours)
    double totalTravelTime = 0;

    /* your code here */
    for(int i = 0; i < NumPlanets; i++) {
      totalTravelTime += CalculateTime(planetArray[i]);
      System.out.printf("Calculating time for planetArray[%d]\n", i);
    }
    System.out.printf("Total travel time(hours) -> %f\n", totalTravelTime);
  }
}