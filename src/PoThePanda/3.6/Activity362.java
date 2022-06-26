public class Activity362 {
    public static void main(String[] args){
        System.out.println(Activity362.survive(false, false));
        System.out.println(Activity362.survive(false, true));
        System.out.println(Activity362.survive(true, false));
        System.out.println(Activity362.survive(false, true));
    }
    // add your boolean statement in place of the true after the return
    public static boolean survive(boolean lost, boolean poisonedWell){
        return lost || (!lost && poisonedWell);
    }
}