package baekjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nx = reader.readLine().split(" ");
        String[] numbers = reader.readLine().split(" ");
        int count = Integer.parseInt(nx[0]);
        int filterNum = Integer.parseInt(nx[1]);

        for (int i = 0; i < count; i++) {
            if (Integer.parseInt(numbers[i]) < filterNum) System.out.print(numbers[i] + " ");
        }
    }
}
