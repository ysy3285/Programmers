package programmers.level2;

import java.util.ArrayList;

// 주식 가격
public class StockPrice {

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		int[] answer = new int[prices.length];
        
		ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i=0; i<prices.length; i++){
            temp.add(prices[i]);
            System.out.println(temp.get(i));
        }
        

	}
	
	

}
