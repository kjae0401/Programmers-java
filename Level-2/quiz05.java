package Level2;

public class quiz05 {
	public int solution(String skill, String[] skill_trees) {
		// https://programmers.co.kr/learn/courses/30/lessons/49993
		/*
		 * 스킬트리
		 * 선행 스킬없는 스킬만 배운 경우가 존재함.
		 */
		int answer = 0;
		StringBuffer sb = new StringBuffer(skill);
		int[] check = new int[26];
		
		for(int i=0; i<skill.length(); i++)
			check[sb.charAt(i) - 65] = i+1;
					
		for(int i=0; i<skill_trees.length; i++) {
			StringBuffer temp = new StringBuffer(skill_trees[i]);
			int cnt = 1;
			boolean flag = true;
			
			for(int j=0; j<temp.length(); j++) {
				if (check[temp.charAt(j)-65] == cnt && check[temp.charAt(j)-65] != 0) {
					cnt++;
					flag = true;
				} else if (check[temp.charAt(j)-65] == 0) { continue; } else {
					flag = false;
					break;
				}
			}
			
			if(flag) answer++;
		}
		
		return answer;
	}
}
