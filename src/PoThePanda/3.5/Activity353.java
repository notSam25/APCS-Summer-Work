public class Activity353 {
    public static void main(String[] args){
        System.out.println(Activity353.survive(false, false));
        System.out.println(Activity353.survive(false, true));
        System.out.println(Activity353.survive(true, false));
        System.out.println(Activity353.survive(false, true));
    }
    // add your boolean statement in place of the true after the return
    public static boolean survive(boolean right, boolean left){
        return right || left || (!left && !right);
    }
}