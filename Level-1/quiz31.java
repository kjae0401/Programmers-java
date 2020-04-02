package Level1;

public class quiz31 {
	public boolean solution(int x) {
		// https://programmers.co.kr/learn/courses/30/lessons/12947
		/*
		 * 하샤드 수
		 */
		boolean answer = true;
		int sum=0;
		StringBuffer sb = new StringBuffer(Integer.toString(x));
		
		for(int i=0; i<sb.length(); i++)
			sum = sum + (sb.charAt(i) - 48);
		
		if (x%sum == 0) { answer = true; }
		else { answer = false; }
		
		return answer;
	}
}
