package CodingQNAs.LeetCode;

import java.util.Arrays;

public class Q_242_ValidAnagram {

    /*
    An Anagram is a word or phrase formed by rearranging the letters of a different word
    or phrase, typically using all the original letters exactly once.
    */
    public static boolean isAnagram(String s, String t) {  //T.C--> O(n * log n)
        char[] c = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c2);
        int l1 = c.length;
        int l2 = c2.length;
        if (l1 != l2) return false;
        for (int i = 0; i < l1; i++) {
            if (c[i] != c2[i])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));
    }
}
