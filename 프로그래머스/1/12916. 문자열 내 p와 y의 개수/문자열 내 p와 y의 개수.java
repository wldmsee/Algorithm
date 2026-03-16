class Solution {
        boolean solution(String s) {
        boolean answer = true;

        // p, y 개수 정의
        int countP = 0;
        int countY = 0;

        // 문자열 중에 특정 문자 추출 > 배열 변환
        char[] arr = s.toLowerCase().toCharArray();

        // for문 (개수 비교)
        for(int i = 0; i < s.length(); i++) {
            if (arr[i] == 'p') {
                countP++;
            } else if (arr[i] == 'y') {
                countY++;
            }
        }
        return countP == countY;
    }
}