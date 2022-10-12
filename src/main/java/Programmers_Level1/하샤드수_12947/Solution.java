package Programmers_Level1.하샤드수_12947;

class solution {
    public boolean solution(int x) {
        boolean answer = true;

        int total = 0;
        int tempNum = x;

        while( tempNum > 10 )
        {
            total += tempNum % 10;
            tempNum = tempNum / 10;
        }
        total += tempNum;

        if(x % total == 0) answer = true;
        else answer = false;


        return answer;
    }
}

/*

public class solution{
    public boolean solution(int x){
    int mod = x;
    int calc = 0;
    do{
        calc += (mod % 10);
        mod = mod/10;
    } while (mod % 10 > 0);

      return (num%calc == 0) ? true : false;
    }
}
 */