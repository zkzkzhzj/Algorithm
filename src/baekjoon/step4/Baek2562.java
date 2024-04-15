package baekjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int line = 0;
        for (int i = 1; i <= 9; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number > max) {
                max = number;
                line = i;
            }
        }
        System.out.println(max);
        System.out.println(line);
    }
}
