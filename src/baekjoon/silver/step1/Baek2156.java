package baekjoon.silver.step1;

import java.io.*;

public class Baek2156 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] cups = new int[Integer.parseInt(reader.readLine())];

        for(int i = 0; i < cups.length; i++) {
            cups[i] = Integer.parseInt(reader.readLine());
        }

        writer.flush();
        writer.close();
        reader.close();
    }

    // 잠시 중단 : DP 개념을 다른 문제로 익히고 다시 풀어보자
}
