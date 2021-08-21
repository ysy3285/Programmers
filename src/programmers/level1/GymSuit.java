package programmers.level1;

import java.util.ArrayList;

// Ã¼À°º¹
public class GymSuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = {1,2,3};
		int[] reserve = {2,3,4};
		int answer = solution(n,lost,reserve);
		System.out.println(answer);
	}

	    public static int solution(int n, int[] lost, int[] reserve) {
	        int answer = n-lost.length;
	        ArrayList<Integer> temp = new ArrayList<Integer>();

	       
	        for(int i=0; i<lost.length; i++) {
	        	for(int j=0; j<reserve.length; j++) {
	        		if(lost[i] == reserve[j]) {
	        			answer++;
	        			reserve[j] = 0;
	        			break;
	        		}
	        		if(lost[i] == reserve[j]-1) {
	        			answer++;
	        			reserve[j] = 0;
	        			break;
	        		}
	        		if(lost[i] == reserve[j]+1) {
	        			answer++;
	        			reserve[j] = 0;
	        			break;
	        		}
	        	}
	        }
	        
	        return answer;
	    }
	
}
