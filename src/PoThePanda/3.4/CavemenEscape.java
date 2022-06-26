public class CavemenEscape {
    public static void main(String[] args){
        /* Question Problem
        Due to his arrogance and utter stupidity, Po ignored your advice in the 
        previous activity and has now been captured by the cavemen. They will only 
        let Po escape if he can correctly spell out the name of an integer. For example, 
        if the cavemen choose the number 3, Po must spell out “three” to survive. Based on 
        the integer that the cavemen choose, print out exactly what Po should spell in order to survive. 
        */

        int cavemenChoice = (int)(5*(Math.random())+1); // Randomly number 1-5
        String Number = "Invalid Number";

        switch(cavemenChoice) {
            case 1: Number = "one";   break;
            case 2: Number = "two";   break;
            case 3: Number = "three"; break;
            case 4: Number = "four";  break;
            case 5: Number = "five";  break;
            default: break;
        }

        System.out.printf("Number to spell(integer, string) -> [ %d, %s ]\n", cavemenChoice, Number);
    }
}