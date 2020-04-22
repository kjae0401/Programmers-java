package Level2;

public class quiz10 {
	static int[][] pictures;
	static boolean[][] visit;
	public int[] solution(int m, int n, int[][] picture) {
		// https://programmers.co.kr/learn/courses/30/lessons/1829
		/*
		 * 카카오 프렌즈 컬러링북
		 * 상하좌우 방문여부 확인 + 같은 값인지 확인을 통한 재귀탐색
		 */
		int numberOfArea=0;
		int maxSizeOfOneArea=0;
		pictures = picture;
		visit = new boolean[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if (picture[i][j] == 0 || visit[i][j]) continue;
				
				numberOfArea++;
				maxSizeOfOneArea = Math.max(maxSizeOfOneArea, Search(i, j));
			}
		}
		int[] answer = {numberOfArea,maxSizeOfOneArea};

		return answer;
	}
	
	static int Search(int i, int j) {
		visit[i][j] = true;
		int max = 0;
		max++;
		
		if (i>0 && pictures[i-1][j] == pictures[i][j] && !visit[i-1][j])
			max += Search(i-1, j);
		if (i<pictures.length-1 && pictures[i+1][j] == pictures[i][j] && !visit[i+1][j])
			max += Search(i+1, j);
		if (j>0 && pictures[i][j-1] == pictures[i][j] && !visit[i][j-1])
			max += Search(i, j-1);
		if (j<pictures[i].length-1 && pictures[i][j+1] == pictures[i][j] && !visit[i][j+1])
			max += Search(i, j+1);
		
		return max;
	}
}