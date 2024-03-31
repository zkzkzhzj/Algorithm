package baekjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int count = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count - i; j++) {
                builder.append(" ");
            }
            for (int k = 1; k <= i; k++) {
                builder.append("*");
            }
            builder.append("\n");
        }
        System.out.println(builder);
    }
}
