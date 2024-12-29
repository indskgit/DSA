package CodingQNAs.Hashing.HashMap;

/*Given a list of words with lower cases.
 Implement a function to find all Words that
 have the same unique character set . */

import java.util.Arrays;

//Example
/*Input: words[] = { "may", "student", "students", "dog",
        "studentssess", "god", "cat", "act",
        "tab", "bat", "flow", "wolf", "lambs",
        "amy", "yam", "balms", "looped",
        "poodle"};
        Output :
        looped, poodle,
        lambs, balms,
        flow, wolf,
        tab, bat,
        may, amy, yam,
        student, students, studentssess,
        dog, god,
        cat, act,*/
public class GroupWordsWithSameSetOfCharacters {

    static final int MAX_CHAR = 26;

    static String getKey(String str) {
        boolean[] visited = new boolean[MAX_CHAR];
        Arrays.fill(visited, false);

        // store all unique characters of current
        // word in key
        for (int j = 0; j < str.length(); j++)
            visited[str.charAt(j) - 'a'] = true;
        String key = "";
        for (int j = 0; j < MAX_CHAR; j++)
            if (visited[j])
                key = key + (char) ('a' + j);
        return key;
    }

    public static void main(String[] args) {
        String words[] = {"may", "student", "students", "dog",
                "studentssess", "god", "cat", "act", "tab",
                "bat", "flow", "wolf", "lambs", "amy", "yam",
                "balms", "looped", "poodle"};

        int n = words.length;
        System.out.println(n);
    }
}
