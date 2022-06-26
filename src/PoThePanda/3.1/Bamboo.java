public class Bamboo {
    public static void main(String[] args){
        /* Problem Question
        Soon afterwards, Po wants to eat some bamboo. Po has 4 patches of bamboo 
        in his habitat, one of which is poisonous. Po observes that patch number 2 
        is oddly colored and reeks of poison, but still randomly chooses which batch 
        to eat. Please determine if the batch Po picked to eat is the poisonous batch.
        */

        int poChoice = (int)(4*(Math.random())+1); // Random number 1-4

        System.out.printf("Po eat's poison(patch, poisoned) -> [ %d, %B ]\n", poChoice, poChoice == 2);
    }
}