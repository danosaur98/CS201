import java.util.Arrays;
import java.util.HashSet;

public class MemberCheck {

    public String[] whosDishonest(String[] club1, String[] club2, String[] club3){
        HashSet<String> visited = new HashSet<>(Arrays.asList(club1));
        HashSet<String> club2Set = new HashSet<>(Arrays.asList(club2));
        HashSet<String> club3Set = new HashSet<>(Arrays.asList(club3));
        HashSet<String> dishonest = new HashSet<>();
        for (String name: club2Set){
            if (!visited.add(name)){
               dishonest.add(name);
            }
        }
        for (String name: club3Set){
            if (!visited.add(name)){
                dishonest.add(name);
            }
        }
        String[] dishonestArray = dishonest.toArray(new String[dishonest.size()]);
        Arrays.sort(dishonestArray);
        return dishonestArray;
    }
}
