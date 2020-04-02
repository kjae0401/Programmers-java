package Level1;

import java.util.ArrayList;

public class quiz5 {

	public int solution(int[][] board, int[] moves) {
		// https://programmers.co.kr/learn/courses/30/lessons/64061
		/*
		 * 크레인 인형뽑기 게임 
		 * STACK
		 */
		int answer = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					result.add(board[j][moves[i] - 1]);
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}

		int count = 0;
		while (count < result.size()) {
			if (count == 0) {
				count++;
				continue;
			}
			if (result.get(count) == result.get(count - 1)) {
				result.remove(count);
				result.remove(count - 1);
				answer += 2;
				count = 0;
			}
			count++;
		}

		return answer;
	}
}
