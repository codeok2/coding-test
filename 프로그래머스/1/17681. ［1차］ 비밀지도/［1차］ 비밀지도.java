class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] tmp = new int[n];
        
        for (int i = 0; i < n; i++) {
            tmp[i] = arr1[i] | arr2[i];
        }
        
        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(tmp[i]);    
            int check = n - s.length();
            if (check != 0) {
                while (check-- > 0) {
                    s = "0" + s;
                }
            }
            answer[i] = s.replace("1", "#").replace("0", " ");
        }
    
        return answer;
    }
}