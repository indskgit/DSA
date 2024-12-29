package CodingQNAs.GFG;

public class MatchSticks_Games {

    /*
    To determine the number of matchsticks A should pick on his first turn to guarantee a win, we need to consider the number of matchsticks initially placed on the table (N).

If N is divisible by 5, it means that no matter how many matchsticks A picks on his first turn, B can always pick the remaining matchsticks such that A will be left with the last matchstick and lose the game. In this case, it is impossible for A to win, so we return -1.

If N is not divisible by 5, A can pick a number of matchsticks that leaves a remaining number that is divisible by 5. This ensures that A can force B into a position where B will always be left with a number of matchsticks that is divisible by 5, allowing A to win the game.

Therefore, the number of matchsticks A should pick on his first turn is (N % 5). This guarantees that A will win the game if N is not divisible by 5. Otherwise, it is impossible for A to win, and -1 is returned.

Example 1:

If N = 9, A should pick (9 % 5) = 4 matchsticks on his first turn to guarantee a win.
If N = 15, it is impossible for A to win, so -1 is returned.
Example 2:

Let's consider the example where N = 48.

Since 48 is not divisible by 5, A can choose a number of matchsticks that leaves a remaining number divisible by 5 to guarantee a win.

In this case, A should pick (48 % 5) = 3 matchsticks on his first turn. By doing so, there will be 45 matchsticks left on the table.

Now, let's consider the possible scenarios:

If B picks 1 matchstick:

There will be 44 matchsticks left on the table. A can then pick 4 matchsticks, leaving 40 matchsticks for B.
B can pick any number of matchsticks from 1 to 4, but A will always be able to maintain a difference of 5 between the number of matchsticks on the table.
Eventually, A will be left with the last matchstick and win the game.
If B picks 2 matchsticks:

There will be 43 matchsticks left on the table. A can then pick 1 matchstick, leaving 42 matchsticks for B.
B can pick any number of matchsticks from 1 to 4, but A will always be able to maintain a difference of 5 between the number of matchsticks on the table.
Eventually, A will be left with the last matchstick and win the game.
If B picks 3 matchsticks:

There will be 42 matchsticks left on the table. A can then pick 4 matchsticks, leaving 38 matchsticks for B.
B can pick any number of matchsticks from 1 to 4, but A will always be able to maintain a difference of 5 between the number of matchsticks on the table.
Eventually, A will be left with the last matchstick and win the game.
If B picks 4 matchsticks:

There will be 41 matchsticks left on the table. A can then pick 1 matchstick, leaving 40 matchsticks for B.
B can pick any number of matchsticks from 1 to 4, but A will always be able to maintain a difference of 5 between the number of matchsticks on the table.
Eventually, A will be left with the last matchstick and win the game.
In all possible scenarios, A can ensure that there is always a difference of 5 between the number of matchsticks on the table. Therefore, by picking 3 matchsticks on his first turn, A is guaranteed to win the game.

I hope this clarifies how the logic works for N = 48.
     */

    static int matchGames(Long n) {
        int res = (int) (n % 5);
        if (res == 0) return -1;
        else return res;

//        return res == 0 ? -1: res;
    }

    public static void main(String[] args) {
        System.out.println(matchGames(23L));
        System.out.println(matchGames(20L));
        //L means Casting to Long
    }
}
