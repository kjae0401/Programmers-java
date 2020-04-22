package Level2;

public class quiz30 {
	public int solution(int[][] land) {
		// https://programmers.co.kr/learn/courses/30/lessons/12913
		/*
		 * 땅따먹기
		 * K[i][0]의 최대의 값
		 * max(K[i-1][1], K[i-1][2], K[i-1][3]) + K[i][0]
		 * 이렇게 K[i][0] ~ K[i][3]을 구해서
		 * i = land.length-1 일때 까지 시행해줌.
		 * 최종 적으로 나온 값 4개중에서 가장 큰 수를 answer로 반환해주면됨.
		 */
		int answer = 0;
		
		for(int i=1; i<land.length; i++) {
			land[i][0] += (Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3])));
			land[i][1] += (Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3])));
			land[i][2] += (Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3])));
			land[i][3] += (Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2])));
		}
		
		answer = Math.max(land[land.length-1][0], Math.max(land[land.length-1][1], Math.max(land[land.length-1][2], land[land.length-1][3])));
		return answer;
	}
}
