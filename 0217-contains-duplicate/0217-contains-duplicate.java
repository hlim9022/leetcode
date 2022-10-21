import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            if(map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }

        for(Map.Entry<Integer, Integer> key: map.entrySet()) {
            if(key.getValue() > 1) return true;
        }
        return false;
    }
}