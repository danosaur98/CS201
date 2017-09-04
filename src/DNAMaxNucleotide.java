/**
 * Created by Daniel Zhou on 9/3/2017.
 */
public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int maxCount = 0;
        int count = 0;
        String ret = "";
        for (String strand : strands) {
            count = 0;
            for (int i = 0; i < strand.length(); i++) {
                if (strand.substring(i, i + 1).equals(nuc)) {
                    count++;
                }
            }
            if (!(count == 0) && !(maxCount == 0) && count == maxCount) {
                if (strand.length() > ret.length()) {
                    ret = strand;
                    maxCount = count;
                }
            } else if (count > maxCount) {
                ret = strand;
                maxCount = count;

            }
        }
        return ret;
    }
}
