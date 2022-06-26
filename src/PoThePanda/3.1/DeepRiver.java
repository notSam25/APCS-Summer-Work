public class DeepRiver{
    public static void main(String[] args){
        /*
        Po has the sudden urge to jump into the nearby river, but unfortunately 
        he doesn’t know or care how deep it is (Po can’t swim). It is up to you 
        to decide whether or not the river is too deep for Po.
        */
        
        int riverDepth = (int)(5*(Math.random())+1); //Randomly generates the actual river depth (A random number between 1 and 5)
        System.out.println("Actual river depth is "+ riverDepth);//Prints out river depth so that you can check if your code worked as intended
        int maxDepth = 2; //The maximum depth of a river that Po can jump in

        //Now it's your turn!
        System.out.println(   ); //Inside this print statement, type a boolean expression that will properly compare Po's maximum depth to the river's depth
        //The statement should print true if Po CAN jump in the river and print false if Po CAN'T jump in the river

    }
}
