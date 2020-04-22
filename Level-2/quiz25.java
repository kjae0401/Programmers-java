package Level2;

public class quiz25 {
	public int solution(int[][] board) {
		// https://programmers.co.kr/learn/courses/30/lessons/12905
		/*
		 * 가장 큰 정사각형 찾기
		 * DP 알고리즘 사용 (동적 계획법)
		 * 0 1 1 1
		 * 1 1 2 2
		 * 1 2 2 3
		 * 0 0 1 0
		 * 만약 (1,2) 탐색 시 (1,2)가 0이상이고,
		 * (0,1), (0,2), (1,1)이 모두 0 이상일 때 세개의 수에서 최소값+1 을 (1,2)에 저장시킨다.
		 * 이 외 경우는 기존 숫자를 그대로 놔두고 다음 탐색을 수행하며, 배열 인덱스 오류가 생겼을 경우에도 그대로 놔두면서
		 * 탐색으로 나온 숫자 (i,j)가 max보다 크면 max에 (i,j)값을 넣어준다.
		 * 만약 2차원 배열이 1개의 행 또는 1개의 열로 이루어졌을 경우 max의 크기는 1을 넘어갈 수 없으므로
		 * max가 1이 되는 순간 탐색을 종료하여 효율성을 높여준다.
		 */
		int answer = 0;
		int max = 0;
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if ((board.length < 2 || board[i].length < 2) && max == 1) {
					i = board.length;
					break;
				}
				try {
					if (board[i-1][j-1] > 0 && board[i][j-1] > 0 && board[i-1][j] > 0 && board[i][j] > 0) {
						int min = Math.min(Math.min(board[i-1][j-1], board[i][j-1]), board[i-1][j]);
						board[i][j] = min+1;
						if (min+1 > max) { max = min+1; }
					}
				} catch (Exception e) { if (board[i][j] == 1) { max = Math.max(max, 1); }}
			}
		}
		
		answer = max * max;
		return answer;
	}
}