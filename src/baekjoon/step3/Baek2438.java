package baekjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2438 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * 다른 사람의 방법
         * StringBuilder 2개를 사용해서 별을 쌓는 builder 별과 띄어쓰기를 쌓는 builder 를 두어 for 1개로 해결
         */

        StringBuilder star = new StringBuilder();
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < count; i++) {
            star.append("*");
            line.append(star + "\n");
        }
        System.out.println(line);
    }
}
