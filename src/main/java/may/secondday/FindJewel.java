package may.secondday;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Deb
 * Date : 02/05/2020.
 *
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class FindJewel {

    public int find(String j, String s) {
        int totalJewel = 0;
        if ( j == null || s == null) {
            return totalJewel;
        }
        char[] splittedJewel =  j.toCharArray();
        char[] splittedStone = s.toCharArray();
        Map<String, Integer> splittedStoneMap = new HashMap<>();
        for (char stone : splittedStone) {
            String stoneAsString = String.valueOf(stone);
            Integer numberOfStone = splittedStoneMap.get(stoneAsString);
            int newNumber = 1;
            if (numberOfStone != null) {
                newNumber = numberOfStone + 1;
            }
            splittedStoneMap.put(stoneAsString, newNumber);
        }
        for (char aJewel : splittedJewel) {
            String jewelAsString = String.valueOf(aJewel);
            Integer totalNumber = splittedStoneMap.get(jewelAsString);
            if (totalNumber != null) {
                totalJewel += totalNumber;
            }

        }
        return totalJewel;
    }
}
