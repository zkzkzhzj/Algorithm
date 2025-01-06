package baekjoon.bronze.step1;

import java.io.*;
import java.util.Arrays;

public class Baek2748 {
    // 값 저장 배열
    static long[] dp;

    // 재귀호출을 위한 메소드
    static long fibonacci(int n) {
        // 매개변수 값을 체크
        if(n == 0) return dp[0];
        if(n == 1) return dp[1];

        // -1 이라면 값 지정을 위해 재귀 호출(0, 1 이 반환될 때 까지 재귀)
        // 계속해서 재귀를 타며 0,1 로 접근한 순간부터 리턴값이 값 지정 시작
        if(dp[n] == -1) {
            dp[n] = fibonacci(n-1) + fibonacci(n-2);
        }

        // 이미 값이 할당 되었다면 해당 값 리턴
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // DP를 사용하지 않은 반복문 방식(초기 구현-bottom_up)
//        long[] fibonacci = new long[Integer.parseInt(reader.readLine())+1];
//
//        fibonacci[0] = 0;
//        fibonacci[1] = 1;
//
//        for(int i = 2; i < fibonacci.length; i++) {
//            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
//        }
//
//        writer.append(fibonacci[fibonacci.length-1]+"");

        // DP를 사용한 방식(재귀호출)
        dp = new long[Integer.parseInt(reader.readLine())+1];
        // 값 지정 확인을 위하여 -1로 초기화
        Arrays.fill(dp, -1);
        // 피보나치 수열(0,1 은 값 지정)
        dp[0] = 0;
        dp[1] = 1;
        // 재귀 호출 시작(반복되며 배열의 값들이 채워지며 n-1 + n-2 = n 으로 할당)
        // 최종적으로 배열의 끝자리 값을 출력
        writer.append(fibonacci(dp.length-1)+"");

        writer.flush();
        writer.close();
        reader.close();
    }
}
