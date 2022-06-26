public class Cave {
    public static void main(String[] args){
        /*
        Po lives close to a vast network of caves, most of which are dangerous and 
        inhabited by spooky cavemen. There are 12 cave entrances, and only caves 6 and 8 are safe to enter. 
        Using else if statements, determine if the cave that Po chose is safe to explore.
        */
        int poChoice = (int)(12*(Math.random())+1); //Randomly generates Po's choice of cave(A random number between 1 and 12)
        System.out.println("Po's cave choice is "+ poChoice);//Prints out the Po's choice so that you can check if your code worked as intended

        //Below, type an else if statement that will print out "Po can explore the cave" if Po chose cave 6, "Po can explore the cave" if Po chose cave 8, and otherwise prints out "Don't explore cave"
    }
}
