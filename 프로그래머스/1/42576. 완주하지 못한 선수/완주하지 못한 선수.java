import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> runner = new HashMap<>();
        for(String person : participant) {
            if (runner.containsKey(person)) {
                runner.put(person, runner.get(person) +1);
            } else {
            runner.put(person, 1);
            }
        }
        
        for(String person2 : completion) {
            if (runner.get(person2) == 1) {
                runner.remove(person2);
            } else {
                runner.put(person2, runner.get(person2) - 1);
            }
        }
        
        answer = String.join("", runner.keySet());
        return answer;
    }
}