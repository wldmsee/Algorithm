class Solution {
    public double solution(int[] arr) {
       double answer = 0;
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // 배열의 합
            sum += arr[i];
        }
        
        answer = (double) sum / arr.length;
        return answer;
    }
}