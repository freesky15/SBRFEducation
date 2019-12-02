package SberbankEducation.Practics;

import java.util.ArrayList;
import java.util.TreeMap;

public class Task4_6 {
    public String getWinner(String [] st, int m){
        int max = m;
        String winner = "";
        TreeMap<String, Integer> gamers = new TreeMap<>();
        for(String pairStr : st){
            Integer val = 0;
            String [] keyVal = pairStr.trim().split(" ");
            if (gamers.keySet().contains(keyVal[0])){
                val = Integer.valueOf(keyVal[1]) + gamers.get(keyVal[0]);
                gamers.put(keyVal[0],val);
            }else {
                val = Integer.valueOf(keyVal[1]);
                gamers.put(keyVal[0], val);
            }
            if (val >= max){
                winner = "Winner: " + keyVal[0] + " : " + String.valueOf(gamers.get(keyVal[0]));
            }
        }

        return winner;
    }
}
