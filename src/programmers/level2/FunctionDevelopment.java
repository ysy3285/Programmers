package programmers.level2;

import java.util.ArrayList;
import java.util.Stack;

// 기능 개발
public class FunctionDevelopment {
	class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	        
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        Stack<Integer> q = new Stack<Integer>();
	        
	        for(int i=speeds.length-1; i>-1; i--){
	            int x = (100-progresses[i]) % speeds[i];
	            
	            if(x == 0){
	                q.push((100-progresses[i]) / speeds[i]);
	            }else{
	                q.push((100-progresses[i]) / speeds[i] + 1);
	            }
	             
	        }
	        int days = 0;
	        int cnt = 0;
	        while(q.size() != 0){
	            days++;
	            cnt = 0;
	            while(q.size() !=0){
	                if(q.peek() > days){
	                    break;
	                }else{
	                    cnt++;
	                    System.out.println(days +"일째"+ q.peek() + ":" + cnt);
	                    q.pop(); 
	                }
	            }
	            if(cnt != 0)
	                temp.add(cnt);
	        }
	        int[] answer = new int[temp.size()];
	        for(int i=0; i<temp.size(); i++){
	            answer[i] = temp.get(i);
	        }
	        
	        
	        return answer;
	    }
	}
}
