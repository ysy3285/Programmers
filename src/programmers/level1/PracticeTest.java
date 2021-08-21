package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

// 모의고사
public class PracticeTest {

	public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1,2,3,4,5}; // 5
        int[] b = {2,1,2,3,2,4,2,5}; //8
        int[] c = {3,3,1,1,2,2,4,4,5,5};//10
        
        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i=0; i<answers.length; i++){
            if(a[i%5] == answers[i])
                cntA++;
            if(b[i%8] == answers[i])
                cntB++;
            if(c[i%10] == answers[i])
                cntC++;
        }

        temp.add(cntA);
        temp.add(cntB);
        temp.add(cntC);
        
        int max = temp.get(0);
        for(int i=0; i<temp.size(); i++){
            if(max<temp.get(i))
                max = temp.get(i);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<temp.size(); i++){
            if(max == temp.get(i))
                list.add(i+1);
        }
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
   
        return answer;
    }
}
