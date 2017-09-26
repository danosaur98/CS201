import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Daniel Zhou on 9/25/2017.
 */
public class ServiceNames {
    public  String[] makeList(String[] services) {
        HashMap<String, ArrayList<String>> input = new HashMap<>();
        for (String service : services) {
            String[] words = service.split(" ");
            if (!(words.length == 1)) {
                for (int i = 1; i < words.length; i++) {
                    if (!input.containsKey(words[i])) {
                        ArrayList<String> empty = new ArrayList<>();
                        empty.add(words[0]);
                        input.put(words[i], empty);
                    } else {
                        ArrayList<String> updated = input.get(words[i]);
                        updated.add(words[0]);
                        input.put(words[i], updated);
                    }
                }

            }
        }
        ArrayList<String> ret = new ArrayList<>();
        for (String element : input.keySet()) {
            Collections.sort(input.get(element));
            ret.add(element + " ==> " + arrToString(input.get(element)) );
        }
        String[] inputArray = ret.toArray(new String[ret.size()]);
        Arrays.sort(inputArray);
        return inputArray;
    }
    public String arrToString(ArrayList<String> str){
        String ret = "";
        for (int i = 0; i < str.size(); i++){
            ret += str.get(i);
            if (!(i == str.size()-1)){
                ret += ", ";
            }
        }
        return ret;
    }
}
