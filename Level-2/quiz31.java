package Level2;

import java.util.HashMap;

public class quiz31 {
	public int solution(int[] nums) {
		// https://programmers.co.kr/learn/courses/30/lessons/1845
		/*
		 * 폰켓몬
		 * hashset이 hashmap 보다 더 적당함
		 */
		int answer = nums.length / 2;
		HashMap<Integer, Void> hash = new HashMap<Integer, Void>();
		
		for(int i=0; i<nums.length; i++) {
			if (!hash.containsKey(nums[i]))
				hash.put(nums[i], null);
		}
		
		if (hash.size() < answer)
			answer = hash.size();
		
		return answer;
	}
}
