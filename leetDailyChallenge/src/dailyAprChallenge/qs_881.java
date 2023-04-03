package dailyAprChallenge;
import java.util.*;
public class qs_881 {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1};
        System.out.println(numRescueBoats(arr, 3));

    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int numBoats = 0;
        int i = 0;
        int j = people.length-1;
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
                j--;
            }else {
                j--;
            }
            numBoats++;
        }
        return numBoats;
    }
}
