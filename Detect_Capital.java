// Here is the link to my solution on leet code.
// https://leetcode.com/problems/detect-capital/solutions/2984367/simple-java-1ms-beats-100-easy-to-understand/

public class Detect_Capital {
    public static void main(String[] args) {

        String word = "aaa";
        System.out.println(detectCapitalUse(word));
    }
    static boolean detectCapitalUse(String word) {

        // We can see that we have to check three conditions.
        // 1. 1st character UpperCase(UC) and rest are LC.
        // 2. All characters are UC.
        // 3. All characters are LC.

        // We will return true in all of the above condition else return false.


        // Find the length of the word.
        int n = word.length();

        // if the length of word is 1 or less then it is valid.
        if(n <= 1) return true;

        int i;
        // Check whether the 1st character is UC or LC.


        if(Character.isUpperCase(word.charAt(0)))       // 1st character is UC.
        {
            // Check whether 2nd character is UC or LC.
            // if UC then all other chars are UC.
            // if LC then all other chars are LC.
            if(Character.isUpperCase(word.charAt(1)))       //2nd character is UC.
            {
                // We have already checked 1st and 2nd character so the loop
                // will operate from 3rd character i.e. index 2.
                for(i = 2; i < n; i++)
                {
                    // Since 2nd char is UC so every char should be UC.
                    // if not then return false.
                    if(!Character.isUpperCase(word.charAt(i)))
                    {
                        return false;
                    }
                }
            }
            else                                            //2nd character is LC.
            {
                for(i = 2; i < n; i++)
                {
                    // Since 2nd char is LC so every char should be LC.
                    // if not then return false.
                    if(Character.isUpperCase(word.charAt(i)))
                    {
                        return false;
                    }
                }
            }

        }
        else                                                    // 1st character is LC
        {
            // There all other characters should be LC.

            // We have checked the 1st character so loop will operate from 2nd character i.e. index 1.

            for(i = 1; i < n; i++)
            {
                // if we have any UC then return false.
                if(Character.isUpperCase(word.charAt(i)))
                {
                    return false;
                }
            }
        }

        // If false is not returned, then the word is valid.
        // Hence, return true.

        return true;
    }
}