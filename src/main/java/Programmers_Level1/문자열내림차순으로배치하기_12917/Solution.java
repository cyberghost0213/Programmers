package Programmers_Level1.문자열내림차순으로배치하기_12917;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n){
        String arr[]=String.valueOf(n).split("");

        Arrays.sort(arr, Collections.reverseOrder());
        String str = "";

        for(String e : arr){
            str+= e;
        }

        return Long.parseLong(str);
    }
}

/*
다른 사람의 풀이

StringBuilder를 사용해서 정렬할 수 있다.
import java.util.*;

class Solution {
  public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
  }
}

 */