package Programmers_Level1.나머지가1이되는수찾기_87389;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 2; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
