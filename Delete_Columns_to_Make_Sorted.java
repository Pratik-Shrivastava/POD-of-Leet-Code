// Follow my leetcode solution below to better understand the problem.
// https://leetcode.com/problems/delete-columns-to-make-sorted/solutions/2990706/simple-java-beats-100-easy-to-understand/


public class Delete_Columns_to_Make_Sorted {
    public static void main(String[] args) {

        String [] strs = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));

    }


    static int minDeletionSize(String[] strs) {


        int count = 0;              // it will count the columns which is not lexicographically sorted.

        int n = strs[0].length();   // it stores length if 1st string.
        int size = strs.length;     // it stores length of array.

//      We need to check the base condition that if the array has 1 or no elements.

        if(size <= 1) return 0;

        int i, j;                   // 'i' is index of string and 'j' index of array.


        for(i = 0; i < n; i++)
        {
//          Iterate from index 0 to n-1 of first string.
            for(j = 1; j < size; j++)
            {
//                  Iterate from index 1 to size-1 of array.
                if(strs[j-1].charAt(i) > strs[j].charAt(i))
                {
                    // if the next character is greater, then count is incremented.
                    count++;
                    // We don't need to check characters further so apply break.
                    break;
                }
            }
        }

        return count;
    }
}
