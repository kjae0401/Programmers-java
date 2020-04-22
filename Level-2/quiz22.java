package Level2;

public class quiz22 {
	public int[] solution(int brown, int red) {
		// https://programmers.co.kr/learn/courses/30/lessons/42842
		/*
		 * 카펫 (완전탐색)
		 * 사각형 가쪽만 brown 색이되는 것.
		 * brown = w*h - red
		 * red   = w*h - ((w-2) * (h-2))
		 */
		int[] answer = new int[2];
		boolean flag = false;
		brown /= 2;
		brown += 2;
		
		for(int i=1; i<=brown; i++) {
			for(int j=1; j<=i; j++) {
				if ((i-2)*(j-2) == red && (i+j) == brown) {
					answer[0] = i;
					answer[1] = j;
					flag = true;
					break;
				}
			}
			if (flag) break;
		}
		
		return answer;
	}
}