package Programmers_Level1.콜라츠추측_12943;

class Solution {
    public int solution(int num) {
        Long n = Long.valueOf(num);
        int count = 0;

        while(n != 1){

            count++;
            if(count == 500)
                return -1;

            if(n % 2 == 0){
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        return count;

    }
}