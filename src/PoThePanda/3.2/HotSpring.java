public class HotSpring {
    public static void main(String[] args){
        /* Question Problem
        Po wants to relax in his local hot spring, which has a labeled 
        thermometer on the outside. Given that Po will die instantly if 
        he experiences any temperature over 100 degrees Fahrenheit, please 
        print out a warning statement if his life is in imminent danger.
        */

        int springTemp = (int)(130*(Math.random())+1); // Random number 1-130
        
        System.out.printf("Will Po die(temperature, death) -> [ %d, %B ]\n", springTemp, springTemp > 100);
    }
}
