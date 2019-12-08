package SberbankEducation.Practics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task4_5 {
    public Map<Integer, Integer> originalMap;
    public Task4_5(Map<Integer, Integer> org){
        this.originalMap = org;
    }

    public Map<Integer, Collection<Integer>> changeMap(){
        Map<Integer, Collection<Integer>> result = new HashMap<>();
        if (this.originalMap.isEmpty()){
            return result;
        }else{
            for (Integer key : this.originalMap.keySet()){
                if (result.containsKey(this.originalMap.get(key))){
                    Collection<Integer> val = result.get(this.originalMap.get(key));
                    val.add(key);
                    result.put(this.originalMap.get(key), val);
                }else {
                    Collection<Integer> val = new ArrayList<>();
                    val.add(key);
                    result.put(this.originalMap.get(key), val);
                }
            }
        }
        return result;
    }
}
