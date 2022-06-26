public class KungFuPanda {
    public static void main(String[] args){
        /* Question Problem
        After realizing that he has no hobbies, Po decides to start 
        learning kung fu. However, the only kung fu class nearby only 
        accepts students 12 and above. Given Po’s age, tell Po whether he 
        can or cannot attend kung fu class using if/else statements.
        */

        final int minAcceptedAge = 12;
        int poAge = (int)(15*(Math.random())+1); // Random 1-15
        
        System.out.printf("Can attend class(age, can attend) -> [ %d, %B ]\n", poAge, poAge >= minAcceptedAge);
    }
}