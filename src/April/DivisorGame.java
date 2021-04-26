package April;

import java.util.HashMap;
import java.util.Map;

public class DivisorGame {
  Map<Integer, Boolean> memo = new HashMap<>();
  public boolean divisorGame(int n) {
    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    boolean response = false;
    for (int i = 1; i < n; i++) {
      if ((n % i) == 0 && !divisorGame(n-i)) {
        response = true;
        break;
      }
    }
    memo.put(n, response);
    return response;
  }
}





/* Divisor Game
Alice and Bob take turns playing a game, with Alice starting first.

Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:

- Choosing any x with 0 < x < n and n % x == 0.
- Replacing the number n on the chalkboard with n - x.

Also, if a player cannot make a move, they lose the game.

Return true if and only if Alice wins the game, assuming both players play optimally.
 */