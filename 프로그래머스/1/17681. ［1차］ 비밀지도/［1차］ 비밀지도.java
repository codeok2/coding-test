class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = "";
        }        

        int num1 = 1;
        for (int i = 0; i < n-1; i++) {
            num1 *= 2;
        }
        
        int[][] map1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            int cmp = num1;
            for (int j = 0; j < n; j++) {
                if (arr1[i] >= cmp) {
                    map1[i][j] = 1;
                    arr1[i] -= cmp;
                }
                cmp /= 2;
            }
        }
        
        int[][] map2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            int cmp = num1;
            for (int j = 0; j < n; j++) {
                if (arr2[i] >= cmp) {
                    map2[i][j] = 1;
                    arr2[i] -= cmp;
                }
                cmp /= 2;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map1[i][j] == 1 || map2[i][j] == 1) {
                    answer[i] = answer[i].concat("#");
                } else {
                    answer[i] = answer[i].concat(" ");
                }
            }
        }
        return answer;
    }
    
}