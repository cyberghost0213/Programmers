package Programmers_Level1.나누어떨어지는숫자배열_12910;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> al = new ArrayList<>();
        for(int e : arr){
            if(e % divisor == 0){
                al.add(e);
            }

        }

        if(al.size() == 0){
            int[] array = new int[1];
            array[0] = -1;
            return array;
        }

        Collections.sort(al);

        int[] answer = new int[al.size()];

        for(int i =0; i < al.size(); i++){
            answer[i] = al.get(i);
        }

        return answer;
    }
}

/*

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> lst1 = new ArrayList<Integer>();

        for(int item : arr) {
            if(item % divisor == 0) {
                lst1.add(item);
            }
        }

        int lstSize = lst1.size();
        if(lstSize == 0) {
            int[] answer = { -1 };
            return answer;
        }

        int[] answer = new int[lstSize];
        for(int i = 0; i < lstSize; ++i) {
            answer[i] = lst1.get(i);
        }
        return answer;
    }
}
 */
