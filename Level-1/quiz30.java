package Level1;

public class quiz30 {
	public double solution(int[] arr) {
		// https://programmers.co.kr/learn/courses/30/lessons/12944
		/*
		 * 평균 구하기
		 */
		double answer = 0;

		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		answer = answer / arr.length;
		return answer;
	}
}