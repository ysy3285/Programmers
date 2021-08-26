package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

// 다리 지나는 트럭
public class TruckCrossingBrige {

	class Solution {
	    public int solution(int bridge_length, int weight, int[] truck_weights) {
	        Queue<Integer> bridge = new LinkedList<>();
	        int answer=0;
	        int current_weight = 0;
	        for(int truck : truck_weights)
	        {
	            while(true){
	                if(bridge.isEmpty()){
	                    bridge.offer(truck);
	                    answer++;
	                    current_weight+=truck;
	                    break;
	                }else if(bridge.size() == bridge_length){
	                    current_weight-=bridge.poll();
	                }else if(current_weight + truck <= weight){
	                    bridge.offer(truck);
	                    answer++;
	                    current_weight+=truck;
	                    break;
	                }else{
	                    bridge.offer(0);
	                    answer++;
	                }
	            }
	        }
	        
	        return answer + bridge_length;
	    }
	}
}
