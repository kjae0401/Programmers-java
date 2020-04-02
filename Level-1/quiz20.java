package Level1;

public class quiz20 {
	public int solution(int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12928
		/*
		 * 약수의 합
		 * n/2가 자기 자신 이외로 가질 수 있는 약수의 최대이다.
		 * i<=n을 i<=n/2로 변경 후 반복문 이후 answer += n을
		 * 추가하면 연산 수를 더 줄일 수 있다.
		 */
		int answer=0;
		
		for(int i=1; i<=n; i++) {
			if((n%i)==0) answer += i;
		}
		
		return answer;
	}
}
