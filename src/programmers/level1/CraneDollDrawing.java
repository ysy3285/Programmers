package programmers.level1;

import java.util.Stack;

// 크레인 인형 뽑기
public class CraneDollDrawing {

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> temp = new Stack<Integer>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if (temp.empty()) {
						temp.push(board[j][moves[i] - 1]);
						board[j][moves[i] - 1] = 0;
						break;
					} else {
						if (temp.peek() == board[j][moves[i] - 1]) {
							temp.pop();
							board[j][moves[i] - 1] = 0;
							answer = answer + 2;
						} else {
							temp.push(board[j][moves[i] - 1]);
							board[j][moves[i] - 1] = 0;
						}
						break;
					}
				}
			}
		}
		return answer;
	}
}
