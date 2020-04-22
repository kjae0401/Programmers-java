package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class quiz02 {
	public int solution(int[] priorities, int location) {
		// https://programmers.co.kr/learn/courses/30/lessons/42587
		/*
		 * 프린터 (스택/큐)
		 * 우선순위데이터를 내림차순 정렬을 통해 빠지는 값의 순서를 구하고
		 * 큐에 저장된 데이터와 우선순위 데이터 순서를 비교,
		 * 같은 값일 경우 큐에서 해당 데이터를 삭제하고, 원하는 location 값인지 확인해준다.
		 * 값 비교를 했으나 다를 경우 해당 값을 큐의 제일 후미로 다시 추가시켜준다.
		 * ※ 값이 맨 뒤로 가더라도 내림차순 값으로 나와야하는 것을 생각해준다.
		 */
		int answer = 0;
		Queue<Integer[]> queue = new LinkedList<Integer[]>();
		Integer[] temp;
		
		for(int i=0; i<priorities.length; i++)
			queue.offer(new Integer[] {i, priorities[i]});
		
		Arrays.sort(priorities);
		int cnt = priorities.length-1;
		
		while (!queue.isEmpty()) {
			temp = new Integer[] {queue.peek()[0], queue.poll()[1]};
			
			if (temp[1] == priorities[cnt]) {
				answer++;
				cnt--;
				if(temp[0] == location) break;
			}
			else {
				queue.offer(temp);
			}
		}
		
		return answer;
	}
}
