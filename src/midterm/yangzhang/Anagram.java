package midterm.yangzhang;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        boolean isPermutation = sortString(s).equals(sortString(t));
        return isPermutation;
    }

    public static String sortString(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array); // char[] to String
    }

    public static void main(String[] args) {
        Anagram test = new Anagram();
        String a = "ahappy";
        String b = "happya";
        System.out.println(test.isAnagram(a, b));
    }

}
