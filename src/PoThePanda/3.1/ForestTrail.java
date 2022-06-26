public class ForestTrail {
    public static void main(String[] args){
        /* Problem Question
        After Po’s meal, he decides to go for a walk in the surrounding forest. 
        There are five possible trails, but only trail 4 leads back to his home. 
        Due to his disregard for his own safety, he once again randomly chooses a trail 
        to walk down. Determine if Po should walk down the trail he picked.
        */

        int poChoice = (int)(4*(Math.random())+1); // Random number 1-5

        System.out.printf("Correct trail(trail, correct) -> [ %d, %B ]\n", poChoice, poChoice == 4);
    }
}
