package CodingQNAs.GFG.POTD;

import java.util.HashMap;

public class Isomorphic_String {

    public static boolean areIsomorphic(String str1, String str2) {
        // Your code here
        if (str1.length() != str2.length()) {
            return false;
        }
        int n = str1.length();
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();


        for (int i = 0; i < n; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
//            System.out.println(c2);
            if (map1.containsKey(c1)) {
                System.out.println("contains key : " + map1.containsKey(c1));
                if (map1.get(c1) != c2) {
                    System.out.println("get : " + map1.get(c1) + " c2 " + c2);
                    return false;
                }
            } else {
                map1.put(c1, c2);
                System.out.println(" map Put " + map1.put(c1, c2));
            }

            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) {
                    return false;
                }
            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println(areIsomorphic(s1, s2));
    }
}
