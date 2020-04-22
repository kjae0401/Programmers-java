package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class quiz36 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		// https://programmers.co.kr/learn/courses/30/lessons/12949
		/*
		 * 행렬의 곱셈
		 * 행렬의 특성 l X m, m X n 두 배열의 가로와 세로 값 m은 같아야 곱셈이 가능하며
		 * 결과는 l X n 크기의 배열이 된다.
		 */
		int l = arr1.length, n = arr2[0].length, m = arr2.length;
		int[][] answer = new int[l][n];
		int value = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int a=0; a<l; a++) {
			for(int b=0; b<n; b++) {
				value = 0;
				for(int c=0; c<m; c++) {
					value += (arr1[a][c] * arr2[c][b]);
				}
				queue.offer(value);
				System.out.println(value);
			}
		}
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<n; j++) {
				answer[i][j] = queue.poll();
			}
		}
		
		return answer;
	}
}
