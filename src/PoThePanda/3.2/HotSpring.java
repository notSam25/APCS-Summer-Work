public class HotSpring {
    public static void main(String[] args){
        /*
        Po wants to relax in his local hot spring, which has a labeled 
        thermometer on the outside. Given that Po will die instantly if 
        he experiences any temperature over 100 degrees Fahrenheit, please 
        print out a warning statement if his life is in imminent danger.
        */
        int springTemp = (int)(130*(Math.random())+1); //Randomly generates the hot spring's temperature (A random number between 1 and 130)
        System.out.println("Actual spring temperature is "+ springTemp);//Prints out the hot spring's temperature so that you can check if your code worked as intended

        //Below, type an if statement that will print out "Hot spring is safe for Po" if the hot spring's temperature is less than or equal to Po's maximum temperature, 100


    }
}
