package programmers.level2;


// 주식 가격
public class StockPrice {

	class Solution {
	    public int[] solution(int[] prices) {
	        int[] answer = new int[prices.length];
	        for(int i=0; i<prices.length; i++){
	            for(int j=i+1; j<prices.length; j++){
	                if(prices[i] > prices[j]){
	        answer[i]++;
	                    break;
	                }
	                    answer[i]++;
	                
	            }
	        }
	        return answer;
	    }
	}

}
