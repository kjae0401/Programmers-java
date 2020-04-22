package Level2;

public class quiz26 {
	static int cnt;
	static boolean[] selected;
	static int[] per;
	public int solution(int n, String[] data) {
		// https://programmers.co.kr/learn/courses/30/lessons/1835
		/*
		 * 단체사진 찍기
		 * 전역 변수를 지역 변수 안에서 초기화 해주지 않으면 테스트 케이스에서 통과되지않음.
		 * 아마도 카카오프렌즈 컬러링북 문제 또한 그러한 이유때문에 테스트 케이스 통과가 안됐었다고 생각됨.
		 */
		char[] friends = {'A','C','F','J','M','N','R','T'};
		
		cnt = 0;
		selected = new boolean[8];
		per = new int[8];
		
		Permutation(0, data, friends);
		int answer = cnt;
		return answer;
	}
	
	public static void Permutation(int pos, String[] data, char[] friends) {
		if (pos == 8) {
			String value = "";
			for(int i=0; i<8; i++)
				value += friends[per[i]];
			
			for(int i=0; i<data.length; i++) {
				char comp;
				int comp1, comp2, result;
				
				comp = data[i].charAt(3);
				comp1 = value.indexOf(data[i].charAt(0));
				comp2 = value.indexOf(data[i].charAt(2));
				result = data[i].charAt(4)-'0';
				
				if (comp == '=') {
					if (Math.abs(comp1-comp2)-1 != result) return;
				} else if (comp == '>') {
					if (Math.abs(comp1-comp2)-1 <= result) return;
				} else {
					if (Math.abs(comp1-comp2)-1 >= result) return;
				}
			}
			
			cnt++;
			return;
		}
		
		for(int i=0; i<8; i++) {
			if (!selected[i]) {
				selected[i] = true;
				per[pos] = i;
				Permutation(pos+1, data, friends);
				selected[i] = false;
			}
		}
	}
}