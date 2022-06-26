public class Activity364 {
    public static void main(String[] args){
        System.out.println(Activity364.survive(false, false, false));
        System.out.println(Activity364.survive(false, false, true));
        System.out.println(Activity364.survive(false, true, false));
        System.out.println(Activity364.survive(false, true, true));
        System.out.println(Activity364.survive(true, false, false));
        System.out.println(Activity364.survive(true, false, true));
        System.out.println(Activity364.survive(true, true, false));
        System.out.println(Activity364.survive(true, true, true));
    }
    // add your boolean statement in place of the true after the return
    public static boolean survive(boolean home, boolean food, boolean water){
        return !((!home && !food) || (home && !water) || (!water && !food));
    }
}