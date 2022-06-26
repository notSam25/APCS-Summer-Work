public class TreeClimb {
    public static void main(String[] args){
        /*
        Po is feeling adventurous and decides to climb the highest tree in 
        his proximity. Po, however, is very heavy and tree branches can often 
        be weak. Given Po’s weight and the maximum load of the tree branch, 
        print out a warning statement if Po’s weight exceeds the maximum load of the tree branch
        */
        int poWeight = 30; //Po weight
        int maxTreeLoad = (int)(50*(Math.random())+1); // Random number 1-50
        System.out.printf("Tree climbable(max load, climbable) -> [ %d, %B ]\n", maxTreeLoad, maxTreeLoad <= poWeight);
    }
}