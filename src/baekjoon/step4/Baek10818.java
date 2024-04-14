package baekjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        String[] numbers = reader.readLine().split(" ");
        int min = 1000000;
        int max = -1000000;
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(numbers[i]);
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }
        System.out.println(min + " " + max);
    }
}
