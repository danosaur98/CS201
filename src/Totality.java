/**
 * Created by Daniel Zhou on 9/3/2017.
 */
public class Totality {
    public int sum(int[] a, String stype) {
        int interval = 2;
        int start = 0;
        int sum = 0;
        if (stype.equals("odd")) {
            start = 1;
        }
        else if (stype.equals("all")){
            interval = 1;
        }
        for (int i = start; i <a.length; i+= interval){
            sum += a[i];
        }
        return sum;
    }
}
