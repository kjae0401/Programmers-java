package Level1;

public class quiz37 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		// https://programmers.co.kr/learn/courses/30/lessons/17681
		/*
		 * [1차]비밀지도
		 */
		String[] answer= new String[n];
		int[][] aria1 = new int[n][n];
		int[][] aria2 = new int[n][n];
		
		for(int i=0; i<n; i++) {
			answer[i] = "";
			for(int j=(n-1); j>=0; j--) {
				if (arr1[i] == 1) {
					aria1[i][j] = 1;
					break;
				}
				else {
					aria1[i][j] = (arr1[i] % 2);
					arr1[i] = arr1[i] / 2;
				}
			}
			
			for(int j=(n-1); j>=0; j--) {
				if (arr2[i] == 1) {
					aria2[i][j] = 1;
					break;
				}
				else {
					aria2[i][j] = (arr2[i] % 2);
					arr2[i] = arr2[i] / 2;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (aria1[i][j] == 1 || aria2[i][j] == 1) {
					answer[i] += "#";
				} else {
					answer[i] += " ";
				}
			}
		}
		
		return answer;
	}
}
