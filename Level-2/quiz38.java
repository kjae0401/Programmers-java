package Level2;

public class quiz38 {
	public int solution(int[] arr) {
		// https://programmers.co.kr/learn/courses/30/lessons/12953
		/*
		 * N개의 최소공배수
		 */
		int answer = 0;
		int temp = LCM(arr[0], arr[1]);
		
		if (arr.length > 2) {
			for(int i=2; i<arr.length; i++) {
				temp = LCM(temp, arr[i]);
			}
		}
		answer = temp;
		return answer;
	}
	
	public static int LCM(int num1, int num2) {
		int temp1, temp2, r=1;
		
		temp1 = num1; temp2 = num2;
		if (num1 < num2) {
			num1 = temp2;
			num2 = temp1;
		}
		while(r > 0) {
			r = num1 % num2;
			num1 = num2;
			num2 = r;
		}
		
		return ((temp1 * temp2) / num1);
	}
}
