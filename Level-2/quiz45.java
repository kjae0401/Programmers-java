package Level2;

public class quiz45 {
	public int solution(String[] board, int m, int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/17679
		/*
		 * [1차] 프렌즈4블록
		 */
		int answer = 0;
		matrix ma = new matrix(board, false);
		
		do {
			answer += ma.Discriminate(m, n);
		} while (ma.isFlag());
		
		return answer;
	}
}

class matrix {
	String[] board;
	boolean flag;
	
	matrix(String[] board, boolean flag) {
		this.board = board;
		this.flag = flag;
	}

	public String[] getBoard() {
		return board;
	}

	public boolean isFlag() {
		return flag;
	}
	
	public int Discriminate(int m, int n) {
		int cnt = 0;
		StringBuilder[] sb = new StringBuilder[board.length];
		int[][] check = new int[m][n];
		this.flag = false;
		
		for(int i=0; i<board.length; i++)
			sb[i] = new StringBuilder(board[i]);
		
		for(int i=0; i<(m-1); i++) {
			for(int j=0; j<(n-1); j++) {
				if (sb[i].charAt(j) != ' ' && sb[i].charAt(j) == sb[i].charAt(j+1) 
						&& sb[i].charAt(j) == sb[i+1].charAt(j) && sb[i].charAt(j) == sb[i+1].charAt(j+1)) {
					check[i][j] = check[i][j+1] = check[i+1][j] = check[i+1][j+1] = 1;
					this.flag = true;
				}
			}
		}
		
		if (this.flag) {
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if (check[i][j] == 1) {
						sb[i].setCharAt(j, ' ');
						cnt++;
					}
				}
			}
		} else { return 0; }
		
		for(int k=0; k<m; k++) {
			for(int i=(m-1); i>=1; i--) {
				for (int j=(i-1); j>=0; j--) {
					if (sb[i].charAt(k) == ' ' && sb[j].charAt(k) != ' ') {
						sb[i].setCharAt(k, sb[j].charAt(k));
						sb[j].setCharAt(k, ' ');
					}
				}
			}
		}
		
		for(int i=0; i<sb.length; i++)
			board[i] = sb[i].toString();
		
		return cnt;
	}
}