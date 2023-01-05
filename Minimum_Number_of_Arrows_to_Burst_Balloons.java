import java.util.Arrays;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args) {

        int [][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));


    }
    static int findMinArrowShots(int[][] points) {

        //Sort the array with respect to end position i.r. points[i][1].
        //We will use lambda expression to customize the sorting.
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));

        //Initialize arrow count from 1 because at least 1 arrow is needed.
        int arrowCount = 1;
        int previous = 0;

        for(int current = 0; current < points.length; current++)
        {
            // If the start position of current balloon is after the end
            // position of previous balloon then increment arrow counter.
            if(points[current][0] > points[previous][1])
            {
                arrowCount++;
                // Update the index of the previously burst balloon
                previous = current;
            }

        }

        //Finally return the arrow count.

        return arrowCount;



    }
}