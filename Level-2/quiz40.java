package Level2;

public class quiz40 {
	public int solution(int[] nums) {
		// https://programmers.co.kr/learn/courses/30/lessons/12977
		/*
		 * 소수 만들기
		 */
		int answer = 0;
		
		for(int i=0; i<nums.length-2; i++) {
			for(int j=(i+1); j<nums.length-1; j++) {
				for(int k=(j+1); k<nums.length; k++) {
					int temp = nums[i] + nums[j] + nums[k];
					if (prime(temp)) answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static boolean prime(int n) {
		boolean flag = true;
		
		for(int i=2; i<n; i++) {
			if (n%i == 0) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
