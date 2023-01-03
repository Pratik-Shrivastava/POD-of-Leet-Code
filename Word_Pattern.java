
// Here is the link to my solution on leet code.
// https://leetcode.com/problems/word-pattern/solutions/2981104/java-beats-100-runtime-easy-to-understand/


import java.util.HashMap;


public class Word_Pattern {
    public static void main(String[] args) {

        String pattern = "aba", s = "cat cat dog";

        System.out.println(wordPattern(pattern, s));


    }
    static boolean wordPattern(String pattern, String s)
    {
        // Approach
        // We can store the pattern and string in the form of
        // key and value using a hashmap.
        // we need to store the words of the string in an array of strings.

        int preIndex = 0;
        int index = 0;
        int n = pattern.length();

        String [] str = new String[n+5];
        int i = 0;

        do {
            index = s.indexOf(' ', preIndex);
            if(index==-1) break;
            str [i] = s.substring(preIndex, index);

            i++;
            preIndex = index+1;

        }while(true);
        str[i] = s.substring(preIndex);

        if(i+1 != n) return false;      // If pattern and string contains unequal members.


        // We need to check both key and value. So, we need two HashMap

        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> StringMap = new HashMap<>();


        for(i = 0; i < n; i++)
        {
            char ch = pattern.charAt(i);
            if(patternMap.containsKey(ch))
            {
                if(!patternMap.get(ch).equals(str[i]))
                {
                    return false;
                }
            }
            else
            {
                patternMap.put(ch, str[i]);
            }
            if(StringMap.containsKey(str[i]))
            {
                if(StringMap.get(str[i]) != ch)
                {
                    return false;
                }
            }
            else
            {
                StringMap.put(str[i], ch);
            }




        }



        return true;
    }
}
