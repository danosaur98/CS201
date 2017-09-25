import java.util.HashMap;

import static java.lang.Character.toLowerCase;

/**
 * Created by Daniel Zhou on 9/24/2017.
 */
public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        HashMap<Character, Integer> available = new HashMap<Character, Integer>();
        for (String headline : headlines) {
            for (String word : headline.split(" ")) {
                for (Character character : word.toCharArray()) {
                    character = toLowerCase(character);
                    if (!available.containsKey(character)) {
                        available.put(character, 1);
                    } else {
                        available.put(character, available.get(character) + 1);
                    }
                }
            }
        }
        int ret = 0;
        outer: for (String message : messages) {
            HashMap<Character, Integer> availableCopy = new HashMap<>(available);

            for (String word : message.split(" ")) {
                for (Character character : word.toCharArray()) {
                    character = toLowerCase(character);
                    if (!availableCopy.containsKey(character)) {
                        continue outer;
                    } else {
                        if ((availableCopy.get(character) - 1) < 0) {
                            continue outer;
                        }
                        availableCopy.put(character, availableCopy.get(character) - 1);
                    }

                }
            }
            ret++;

        }
        return ret;
    }
}
