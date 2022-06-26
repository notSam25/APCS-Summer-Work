public class DeepRiver{
    public static void main(String[] args){
        /* Problem Question
        Po has the sudden urge to jump into the nearby river, but unfortunately 
        he doesn’t know or care how deep it is (Po can’t swim). It is up to you 
        to decide whether or not the river is too deep for Po.
        */
        
        int riverDepth = (int)(5 * (Math.random()) + 1); // Random 1-5, unit????
        final int maxDepth = 2; // Max unit depth

        System.out.printf("Can jump(hight, jumpable) -> [ %d, %B ]\n",riverDepth, riverDepth <= maxDepth);
    }
}