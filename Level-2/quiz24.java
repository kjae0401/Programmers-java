package Level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class quiz24 {
	public int solution(int stock, int[] dates, int[] supplies, int k) {
		// https://programmers.co.kr/learn/courses/30/lessons/42629
		/*
		 * 라면공장 (Heap)
		 * 우선 순위 큐의 내림차순을 이용한 문제
		 * 저장된 값이 0일 때 제공량의 역순으로 저장된 우선 순위 큐에서 값을 빼서 stock에 더해준다.
		 * 코드 상으로는 stock이 0이될 때 공급받는 것처럼 보이지만
		 * 문제와 비교하여 해석했을 땐 공급받을 수 있는 날에 공급 받을지 받지않을지 결정해서 공급받는 것과 다름없다.
		 * ex) stock=4, dates={4,10,15}, supplies={20,5,10}, k=30
		 * 4일에 공급받을 수 있는 20을 우선순위큐에 저장한다. 그러나 4일에 stock은 0이되므로 무조건 공급을 받는다.
		 * 그래서 우선순위큐에 저장된 20을 stock에 더한다. 그리고 10일째 5를 공급받을 수 있기때문에 우선순위큐에 5를 저장한다.
		 * 하지만 stock의 양은 다음번 공급때까지 공급받지 않아도 될만큼의 양을 들고있기에 공급받지않고 넘어간다.
		 * 15일째 10을 공급받을 수 있기에 우선순위큐에 저장. 남은 양으로는 23일째 가지고있는 양을 모두 소모하므로 한번 더 공급받아야한다.
		 * 우선순위큐를 내림차순으로 정렬했기때문에 10이 반환된다. 이것을 stock에 더해주면 stock은 k-1일까지 버틸 양이된다.
		 * 이로써 4, 15일 두번의 공급으로 k-1일 까지 버틸 수 있다.
		 */
		int answer = 0;
		PriorityQueue<Integer> p_queue = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0, cnt=0; i<k-1; i++) {
			if (cnt < dates.length && (i+1) == dates[cnt]) {
				p_queue.offer(supplies[cnt++]);
			}
			stock--;
			
			if (stock == 0) {
				stock += p_queue.poll();
				answer++;
			}
		}
		
		return answer;
	}
}