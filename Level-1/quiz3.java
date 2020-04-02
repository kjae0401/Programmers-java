package Level1;

import java.util.Arrays;

public class quiz3 {
	public int[] solution(int[] array, int[][] commands) {
		// https://programmers.co.kr/learn/courses/30/lessons/42748
		/*
		 * 모의고사
		 * int[] temp = Arrays.copyOfRange(des, n, k);
		 * des 라는 배열의 n부터 k위치까지를 잘라서 temp에 복사해줌
		 */
		int[] answer = {};
		int[] temp;
		answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			temp = new int[commands[i][1]-commands[i][0]+1];
			for (int j=commands[i][0]-1, k=0; j<commands[i][1]; j++, k++) {
				temp[k] = array[j];
			}
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
		
		return answer;
    }
}
