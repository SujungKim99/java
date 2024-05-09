package StudyGroup.Study0502;

import java.util.Arrays;

//피보나치 수열을 만드시오.
//단,길이는 20개로 한함
public class Example03 {
    public static void main(String[] args) {
        //피보나치 수열을 만들자.
        //1. 피보나치[수열]이란다. 수열. 수열이 뭘까. 숫자의 열이 수열이고 그 수열의 규칙이 피보나치 인것이다.
        //수열은 숫자의 열 =  수열은 숫자의 배열
        //배열을 선언해준다.
        //길이가 20개로 한한다고 한걸 보니 배열의 길이가 20이겠구나
        int [] pi = new int[20];
        //배열의 각 인덱스에 요소들을 체워 넣어야 하는데 피보나치 배열은 1번항(0번째 인덱스), 2번항(1번째 인덱스)이 1이고.
        //3번항(2번째 인덱스)부터 자신(기준 인덱스)의 전항 + 자신의 전전항을 더한값이 들어간다.
        //-> i번째 인덱스를 자신이라고 가정한다면 i = (i-1) + (i-2)가 된다.

        //배열의 0번째 인덱스부터 19번째 인덱스까지 체우는 행동을 반복하기 위해 for 문을 사용하겠다.
        for (int i = 0; i < pi.length; i++) {
            //1번,2번항 = 0번째,1번째 각각의 인덱스 요소들은 값이 1로 고정되어 있으므로
            //i가 2번 인덱스 보다 작을때까지는
            if(i < 2) {
                //i번째(0,1)인덱스에 1값을 넣어주는 행동만 반복하고
                pi[i] = 1;
                //i가 2번째 인덱스를 가르키는 순간부터
            } else {
                //피보나치 수열 공식을 적용한다.
                pi[i] = pi[i-1] + pi[i-2];
            }
        }
        System.out.println(Arrays.toString(pi));
    }
}