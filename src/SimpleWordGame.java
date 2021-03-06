import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Daniel Zhou on 9/25/2017.
 */
public class SimpleWordGame {

    public int points(String[] player, String[] dictionary) {
        int score = 0;
        HashSet<String> playerSet = new HashSet<>(Arrays.asList(player));
        HashSet<String> dictionarySet = new HashSet<>(Arrays.asList(dictionary));
        for (String playerW : playerSet) {
            if (dictionarySet.contains(playerW)) {
                score += Math.pow(playerW.length(), 2);
            }
        }
        return score;
    }
}
