import java.util.*;

class Solution {
    static Map<String, int[]> keypad = new HashMap<>();
    public String solution(int[] numbers, String hand) {
        setKeypad();
        String left = "*";
        String right = "#";
        
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                left = String.valueOf(number);
                sb.append("L");
            } else if (number == 3 || number == 6 || number == 9) {
                right = String.valueOf(number);
                sb.append("R");
            } else {
                int[] leftIndex = keypad.get(left);
                int[] rightIndex = keypad.get(right);
                int[] targetIndex = keypad.get(String.valueOf(number));
                
                int leftD = Math.abs(targetIndex[0]-leftIndex[0]) + Math.abs(targetIndex[1]-leftIndex[1]);
                int rightD = Math.abs(targetIndex[0]-rightIndex[0]) + Math.abs(targetIndex[1]-rightIndex[1]);
                
                if (leftD < rightD) {
                    left = String.valueOf(number);
                    sb.append("L");
                } else if (rightD < leftD) {
                    right = String.valueOf(number);
                    sb.append("R");
                } else {
                    if (hand.equals("left")) {
                        left = String.valueOf(number);
                        sb.append("L");
                    } else {
                        right = String.valueOf(number);
                        sb.append("R");
                    }
                }
            }
        }
        String result = sb.toString();
        return result;
    }
    
    private void setKeypad() {
        keypad.put("1", new int[] {0, 0});
        keypad.put("2", new int[] {0, 1});
        keypad.put("3", new int[] {0, 2});
        keypad.put("4", new int[] {1, 0});
        keypad.put("5", new int[] {1, 1});
        keypad.put("6", new int[] {1, 2});
        keypad.put("7", new int[] {2, 0});
        keypad.put("8", new int[] {2, 1});
        keypad.put("9", new int[] {2, 2});
        keypad.put("*", new int[] {3, 0});
        keypad.put("0", new int[] {3, 1});
        keypad.put("#", new int[] {3, 2});
    }
}