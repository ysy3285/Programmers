package programmers.level1;

import java.util.ArrayList;

// �ű� ���̵� ��õ
public class NewIDRecommend {

	public static void main(String[] args) {
		String new_id = "123_.def";
		String answer = solution(new_id);
		System.out.println(answer);
	}
	
	    public static String solution(String new_id) {
	        String answer = "";
	        // 1�ܰ�
	      new_id = new_id.toLowerCase();
	      System.out.println(new_id);
	        String[] str = new_id.split("");
	        ArrayList<String> temp = new ArrayList<String>();
	        for(int i=0; i<str.length; i++) {
	            // 2�ܰ�
	            if((int)str[i].charAt(0) > 96 && (int)str[i].charAt(0) < 123 
	               || (int)str[i].charAt(0) == 45 || (int)str[i].charAt(0) == 95
	               || (int)str[i].charAt(0) == 46 || ((int)str[i].charAt(0) > 47 && (int)str[i].charAt(0) < 58)) {
	            	
	                // 3�ܰ�
	            	if(temp.size() == 0 && str[i].equals(".")) 
	            		temp.add(str[i]);
	            	
	            	else if(i != 0 && temp.get(temp.size()-1).equals(".") && str[i].equals(".")) 
	                    continue;
	                else
	                    temp.add(str[i]);
	            }
	        }
	        System.out.print("3�� �� �� : ");
	        for(int i=0; i<temp.size(); i++) {
	        	
	        	System.out.print(temp.get(i));
	        }
	        System.out.println();
	        // 4�ܰ�
	        if(temp.get(0).equals("."))
	            temp.remove(0);
	        if(temp.size() !=0 && temp.get(temp.size()-1).equals(".")) {
	            temp.remove(temp.size()-1);
	        }
	        System.out.print("4�� �� �� : ");
	        for(int i=0; i<temp.size(); i++) {
	        	
	        	System.out.print(temp.get(i));
	        }
	        System.out.println();
	        // 5�ܰ�
	        if(temp.size() == 0)
	            temp.add("a");
	        // 6�ܰ�
	        if(temp.size() >= 16){
	            for(int i=temp.size()-1; i>14; i--){
	                temp.remove(i);
	            }
	            if(temp.get(temp.size()-1).equals("."))
	                temp.remove(temp.size()-1);
	        }
	        // 7�ܰ�
	        if(temp.size() <= 2){
	            while(temp.size() < 3) {
	            	temp.add(temp.get(temp.size()-1));
	            }
	        }
	        for(int i=0; i<temp.size(); i++){
	            answer += temp.get(i);
	        }
	        return answer;
	    }
}
