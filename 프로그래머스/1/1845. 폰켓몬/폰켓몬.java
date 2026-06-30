import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map<Integer, Integer> pkm = new HashMap<>();
        
        for (int num : nums) {
            if (pkm.containsKey(num)) {
                int tmp = pkm.get(num);
                pkm.put(num, tmp+1);
            } else {
                pkm.put(num, 1);
            }
        }
        
        int pkmNum = nums.length / 2;
        // 가져가야 할 폰캣몬 개수 <= 자료수 -> 답은 그냥 개수
        // 가져가야 할 폰캣몬 개수 > 자료수 -> 답은 자료수 
        if (pkmNum <= pkm.size()) {
            answer = pkmNum;
        } else {
            answer = pkm.size();
        }
        return answer;
    }
}