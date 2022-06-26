public class AcidicRiver {
    public static void main(String[] args){
        /* Question Problem
        Po wants to go for a swim in a polluted river, but like all pandas, 
        he is extremely vulnerable to extreme acidity in water. Given the acidity 
        limit of pandas and the acidity of the polluted water, tell Po whether or not 
        he should swim in the river.
        */

        final int poMaxTollerance = 6; // Po's max acidity tollerance
        int riverAcidity = (int)(8*(Math.random())+1); // Random number 1-8

        System.out.printf("Can Po swim(acidity, swimable) -> [ %d, %B ]\n", riverAcidity, poMaxTollerance >= riverAcidity);
    }
}