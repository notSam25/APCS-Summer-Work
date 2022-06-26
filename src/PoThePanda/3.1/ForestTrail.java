public class ForestTrail {
    public static void main(String[] args){
        /*
        After Po’s meal, he decides to go for a walk in the surrounding forest. 
        There are five possible trails, but only trail 4 leads back to his home. 
        Due to his disregard for his own safety, he once again randomly chooses a trail 
        to walk down. Determine if Po should walk down the trail he picked.
        */
        int poChoice = (int)(4*(Math.random())+1); //Randomly generates the path that Po chooses to explore (A random number between 1 and 5)
        System.out.println("Po chose path "+ poChoice);//Prints out Po's choice so that you can check if your code worked as intended

        //Now it's your turn!
        System.out.println(   ); //Inside this print statement, type a boolean expression that will properly compare Po's choice to the safe path number, 2
        //The statement should print true if Po chose path 4 and print false if Po DIDN'T choose the path 4
    }
}
