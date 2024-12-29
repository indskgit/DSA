package CodingQNAs.LearningDays;

public class smallestGreatest {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'd', 'g', 'j', 'k', 'o'};
        int ans = nextGreatestLetter(letters, 'i');
        System.out.println(ans);

    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end + start) / 2;

            if (letters[mid] < target) {
                mid = start + 1;
            } else {
                mid = end - 1;
            }
        }

        return letters[start % letters.length];
    }
}