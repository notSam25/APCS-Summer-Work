public class Cave {
    public static void main(String[] args){
        /* Problem Question
        Po lives close to a vast network of caves, most of which are dangerous and 
        inhabited by spooky cavemen. There are 12 cave entrances, and only caves 6 and 8 are safe to enter. 
        Using else if statements, determine if the cave that Po chose is safe to explore.
        */

        int poChoice = (int)(12*(Math.random())+1); //Randomly generates Po's choice of cave(A random number between 1 and 12)
        boolean canEnterCave = false;

        if(poChoice == 6)
            canEnterCave = true;
        else if(poChoice == 8)
            canEnterCave = true;
        else 
            canEnterCave = false;

        System.out.printf("Can explore cave(choice, should enter) -> [ %d, %B ]\n", poChoice, canEnterCave);
    }
}