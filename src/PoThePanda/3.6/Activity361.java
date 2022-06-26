public class Activity361 {
    public static void main(String[] args){
        System.out.println(Activity361.survive(false, false));
        System.out.println(Activity361.survive(false, true));
        System.out.println(Activity361.survive(true, false));
        System.out.println(Activity361.survive(false, true));
    }
    // add your boolean statement in place of the true after the return
    public static boolean survive(boolean water, boolean food){
        return water && food;
    }
}