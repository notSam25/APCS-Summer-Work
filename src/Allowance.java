package src;
public class Allowance {
  public static void main(String[] args) {
    int myAge = 16, friendAge = 20;
    // 'final' == 'const'
    final double allowance = 3.5;
    final int friendMonthlyAllowance = 35;
    double myMonthlyAllowance = myAge * allowance, friendAllowanceMultiplyer = (double)friendMonthlyAllowance / (double)friendAge;
    System.out.printf("My monthly allowance(age, allowance/mon) -> [ %d, %f ]\n", myAge, myMonthlyAllowance);
    System.out.printf("Friend monthly allowance(age, allowance) -> [ %d, %f ]\n", friendAge, friendAllowanceMultiplyer);
  }
}