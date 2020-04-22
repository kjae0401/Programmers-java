package Level2;

import java.util.PriorityQueue;

public class quiz17 {
	public int solution(int[] scoville, int K) {
		// https://programmers.co.kr/learn/courses/30/lessons/42626
		/*
		 * 더 맵게 (Heap)
		 * 우선 순위 큐. 값의 크기에 따라 오름차순으로 우선순위가 정해진다.
		 * 큐에 저장된 값을 모두 사용하면서 K 이상 값이 될 때도 존재함.
		 * 그래서 try~catch로 NullPointerException을 잡고 섞은 값이 K이상이면
		 * cnt를 출력하도록 해준다. 
		 */
		int answer = -1;
		int cnt = 1;
		PriorityQueue<Integer> p_queue = new PriorityQueue<Integer>();
		
		for(int i=0; i<scoville.length; i++)
			p_queue.offer(scoville[i]);
		
		while (p_queue.size() > 1) {
			int sum = p_queue.poll() + (2 * p_queue.poll());
			try {
				if (sum >= K && p_queue.peek() >= K) {
					answer = cnt;
					break;
				} else {
					cnt++;
					p_queue.offer(sum);
				}
			} catch(Exception e) {
				if (sum >= K) answer = cnt;
			}
		}
		
		return answer;
	}
}