import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Daniel Zhou on 9/5/2017.
 */
public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        for (int i = 0; i < orders.length; i++) {
            if (canMake(orders[i], available)) {
                return i;
            }
        }
        return -1;
    }

    public boolean canMake(String order, String[] available) {
        HashSet<String>bar = new HashSet<String>(Arrays.asList(available));
        HashSet<String>cs = new HashSet<String>(Arrays.asList(order.split(" ")));
        for (String ingredient: cs){
            if (!bar.contains(ingredient)){
                return false;
            }
        }
        return true;
    }
}