package Programmers_Level1.서울에서김서방찾기_12919;

class Solution {
    public String solution(String[] seoul) {

        int i = 0;
        for(String e : seoul){
            if(e.equals("Kim")){
                return "김서방은 " + i + "에 있다";
            }
            i++;
        }
        return "";
    }
}

/*
다른 사람의 풀이

// ArrayList의 내부함수를 이용한 풀이
public class Solution {
    public String solution(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }


}
 */