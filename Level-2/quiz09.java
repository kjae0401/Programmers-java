package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class quiz09 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		// https://programmers.co.kr/learn/courses/30/lessons/42583
		/*
		 * 다리를 지나는 트럭 (스택/큐)
		 */
		int answer=0;
		int total=0, cnt=1;
		Queue<Integer[]> queue = new LinkedList<Integer[]>();		
		
		for(int i=0; i<truck_weights.length; i++) {
			try {
				while (total+truck_weights[i] > weight || (queue.peek()[1] + bridge_length) <= cnt) {
					cnt = queue.peek()[1] + bridge_length;
					total -= queue.poll()[0];
				}
			} catch (Exception e) {}
			queue.offer(new Integer[] {truck_weights[i], cnt});
			total += truck_weights[i];
			cnt++;
		}
		
		answer = cnt-1+bridge_length;
		return answer;
	}
}
