import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> bucket = new Stack<>();
        
        for (int i = 0; i < moves.length; i++) {
            int column = moves[i] -1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][column] != 0) {
                    if (!bucket.empty()) {
                        int top = bucket.peek();
                        if (top == board[j][column]) {
                            answer += 2;
                            bucket.pop();
                        } else {
                            bucket.push(board[j][column]);
                        }
                    } else {
                        bucket.push(board[j][column]);
                    }
                    board[j][column] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}