package programmers.level2;

import java.util.ArrayList;

// 프린터
public class Printer {
	
	public int solution(int[] priorities, int location) {
	       ArrayList<Integer> print = new ArrayList<>();
			for(int document : priorities) 
	            print.add(document);
			boolean flag;
			int answer = 0;
			
			while(location >= 0) {
				flag = true;
				for(int num : print) {
					if(print.get(0) < num) {
						print.add(print.get(0));
						print.remove(0);
						location--;
						if(location < 0) 
	                        location = print.size()-1;
						flag = false;
						break;
					}
				}
				if(flag) {
					print.remove(0);
					answer++;
					location--;
				}
				
			}
			return answer;
	    }

}
