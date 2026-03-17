import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
             // 조건에 맞는 숫자만 모으기 : ArrayList<>
        ArrayList<Integer> list = new ArrayList<>();
        
        // array[i] % divisor == 0
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        
        // else return [-1]
        if (list.size() == 0) {
            return new int[]{-1};
        }
        
        // 오름차순
        Collections.sort(list);
        
        // list -> 배열
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}