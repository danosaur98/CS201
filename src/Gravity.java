/**
 * Created by Daniel Zhou on 9/3/2017.
 */
public class Gravity {
    public double falling(double time, double velo){
        return velo * time + 0.5 * 9.8 * Math.pow(time, 2);
    }
}
