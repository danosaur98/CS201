import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by Daniel Zhou on 9/25/2017.
 */
public class IsomorphicWords {
    public static void main(String[] args) {
        String[] words = {"aa", "ab", "bb", "cc", "cd"};
        System.out.println(countPairs(words));
    }

    public static int countPairs(String[] words) {
        int ret = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                HashMap<Character, Character> map = new HashMap<>();
                String s1 = words[i];
                String s2 = words[j];
                char[] c1 = s1.toCharArray();
                char[] c2 = s2.toCharArray();
                for (int k = 0; k < c1.length; k++) {
                    if (map.containsValue(c2[k])) {
                        break;
                    }
                    if (!map.containsKey(c1[k])) {
                        map.put(c1[k], c2[k]);
                    }
                }
                boolean[] switched = new boolean[c1.length];
                for (char c : map.keySet()) {
                    for (int k = 0; k < c1.length; k++) {
                        if ((c1[k] == c) && !switched[k]) {
                            switched[k] = true;
                            c1[k] = map.get(c);
                        }
                    }
                }
                if (Arrays.equals(c1, c2)) {
                    ret++;
                }
            }
        }
        return ret;
    }
}
