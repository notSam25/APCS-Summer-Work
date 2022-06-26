public class Bamboo {
    public static void main(String[] args){
        /*
        Soon afterwards, Po wants to eat some bamboo. Po has 4 patches of bamboo 
        in his habitat, one of which is poisonous. Po observes that patch number 2 
        is oddly colored and reeks of poison, but still randomly chooses which batch 
        to eat. Please determine if the batch Po picked to eat is the poisonous batch.
        */
        int poChoice = (int)(4*(Math.random())+1); //Randomly generates the patch that Po chooses to eat (A random number between 1 and 4)
        System.out.println("Po chose patch "+ poChoice);//Prints out Po's choice so that you can check if your code worked as intended

        //Now it's your turn!
        System.out.println(   ); //Inside this print statement, type a boolean expression that will properly compare Po's choice to the poison patch number, 2
        //The statement should print true if Po did NOT choose the poison patch and print false if Po DID choose the poison patch
    }
}
