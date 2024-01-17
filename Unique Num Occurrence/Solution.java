import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        while (i < arr.length) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            i++;
        }

        List<Integer> mapVal = new ArrayList<>(map.values());
        Collections.sort(mapVal);

        for (int j = 0; j < mapVal.size() - 1; j++) {

            if (mapVal.get(j) == mapVal.get(j + 1)) {
                return false;
            }

        }

        return true;
    }
}