package baekjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int count = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= count; i++) {
            String[] num = reader.readLine().split(" ");
            builder.append(String.format("Case #%d: %d\n", i, Integer.parseInt(num[0]) + Integer.parseInt(num[1])));
        }
        reader.close();
        System.out.println(builder);
    }
}
