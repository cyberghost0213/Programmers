package Programmers_Level1.문자열내p와y의개수_12916;

class Solution {
    boolean solution (String s){
        boolean answer = true;
        int countP = 0;
        int countY = 0;

        String loweredWord = s.toLowerCase();

        for(int i = 0; i<loweredWord.length(); i++){
            if(loweredWord.charAt(i) == 'p') countP++;
            if(loweredWord.charAt(i) == 'y') countY++;
        }

        if(countP == countY) answer = true;
        else answer = false;

        return answer;
    }
}