// Here is the link to my solution on leet code.
// https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/solutions/2996141/simple-java-beats-100-easy-to-understand/

import java.util.HashMap;
import java.util.Map;

public class Minimum_Rounds_to_Complete_All_Tasks {
    public static void main(String[] args) {

        int [] tasks = {1,1,1,1,1};
        System.out.println(minimumRounds(tasks));
    }
    static int minimumRounds(int[] tasks) {



        //We will use hashMap to calculate the frequency the elements;
        //If array is empty then return -1.

        //if(tasks.length < 1) return -1;

        Map<Integer, Integer> map = new HashMap<>();

        int i;
        //Iterate the array to find frequency.
        for(i = 0; i < tasks.length; i++)
        {
            // if map contains the element then increment the freq, otherwise put 1.

            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
        }

        int round = 0; //It will count the number of rounds.

        //Iterate the hash-map to get the frequency and check for rounds.
        //We will use Entry-Map to iterate the hash map.

        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            int freq = entry.getValue();

            // We only have below test cases.
            if(freq == 1)
            {
                return -1;
            }
            else if(freq % 3 == 0)
            {
                round += (freq / 3);
            }
            else
            {
                round += (freq / 3)+1;
            }


        }
        //Finally, return round.

        return round;


    }
}
