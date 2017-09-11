import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ClassScores {
    public int[] findMode(int[] scores) {
        HashSet<Integer> checked_scores = new HashSet<Integer>();
        ArrayList<Integer> modes= new ArrayList<Integer>();
        int min = 0;
        for (int score: scores){
            if (!checked_scores.contains(score)){
                checked_scores.add(score);
                int frequency = findDuplicates(scores, score);
                if (frequency>min){
                    min = frequency;
                    modes = new ArrayList<Integer>();
                    modes.add(score);
                }
                else if (frequency == min){
                    modes.add(score);
                }
            }
        }
        int[] modeArray = new int[modes.size()];
        for (int i=0; i <modes.size(); i++){
            modeArray[i] = modes.get(i);
        }
        Arrays.sort(modeArray);
        return modeArray;
    }
    public int findDuplicates(int[] scores, int score){
        int counter = 0;
        for (int s :scores){
            if (s == score){
                counter ++;
            }
        }
        return counter;
    }
}
