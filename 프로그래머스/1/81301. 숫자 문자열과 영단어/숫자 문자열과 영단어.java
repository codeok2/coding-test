import java.util.*;
class Solution {
    public int solution(String s) {
        Map<String, String> map = new HashMap<>();
        pushMap(map);
        
        StringBuilder tmpSb = new StringBuilder();
        StringBuilder ansSb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (num < 10) {
                ansSb.append(num);
            } else {
                tmpSb.append(s.charAt(i));
                if (map.containsKey(tmpSb.toString())) {
                    ansSb.append(map.get(tmpSb.toString()));
                    tmpSb.setLength(0);
                   } 
                }    
        }
        int ans = Integer.parseInt(ansSb.toString());
        return ans;
        
    }
    
    private void pushMap(Map<String, String> map) {
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
    }
}