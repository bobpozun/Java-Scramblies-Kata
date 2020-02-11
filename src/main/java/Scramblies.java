public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        boolean result = true;
        // your code
        //int j = 0;
        for(int i = 0; i < str2.length(); i++){
            if(str1.contains(str2.charAt(i) + ""))
                str1 = str1.substring(0, str1.indexOf(str2.charAt(i))) + str1.substring(str1.indexOf(str2.charAt(i)) + 1);
            else
                return false;
        }
        return result;
    }
}