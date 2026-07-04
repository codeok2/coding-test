import java.util.Set;
import java.util.HashSet;
class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for (String number : phone_book) {
            set.add(number);
        }
        
        // 본인 접두어가 집합에 있는지(해시 활용)
        for (String number: phone_book) {
            for (int i = 1; i < number.length(); i++) {
                String part = number.substring(0, i);
                if (set.contains(part)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}