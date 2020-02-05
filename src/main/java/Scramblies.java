import java.util.*;

public class Scramblies {

    /*
Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
Notes:
    Only lower case letters will be used (a-z). No punctuation or digits will be included.
    Performance needs to be considered
Input strings s1 and s2 are null terminated.
    */

    /*
        putting one of the words in hashmap, have a count corresponding to each letter
        iterate the other word, for each letter I will check if it is contained in the hashmap
        so if it's contained, I will decrease the count by 1
        if the count is 0 and it is found, return false
        if it's not found, then I can return false;
    */

    public static boolean scramble(String str1, String str2) {
        boolean result = true;
        int n = str1.length();
        int m = str2.length();
        // int mapsize = 0;
        // if (n > m)  mapsize = 0;

        // else mapsize = 1;

        /*katas, steak*/

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < n; i++){
            char letter = str1.charAt(i);
            if (map.containsKey(letter)){
                int value = map.get(letter);
                map.put(letter, value + 1);
            }

            else{
                map.put(letter, 1);
            }
        }

        for (int i = 0; i <  m; i++){
            char letter = str2.charAt(i);

            if (map.containsKey(letter) && map.get(letter) != 0){
                int value = map.get(letter);
                map.put(letter, value - 1);
            }

            else{
                result = false;
                break;
            }

            
        }


        
         
        return result;
    }
}