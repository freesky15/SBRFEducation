package SberbankEducation.Practics;

import java.util.TreeMap;

public class Task4_2 {
    public TreeMap<Character, Integer> getDictinary(String st)
    {
        TreeMap<Character, Integer> dict = new TreeMap<>();
        String newSt = st.toLowerCase();
        String newStTmp;
        for (char ch = 'a'; ch <= 'z'; ch++){
            newStTmp = newSt.replaceAll(String.valueOf(ch),"");
            Integer count = newSt.length() - newStTmp.length();
            if (count != 0){
                dict.put(ch, count);
            }
            newSt = newStTmp;
        }
        return dict;
    }
}
