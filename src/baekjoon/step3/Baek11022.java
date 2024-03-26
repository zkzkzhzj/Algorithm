package baekjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11022 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int count = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= count; i++) {
            String[] read = reader.readLine().split(" ");
            builder.append(String.format("Case #%d: %s + %s = %d\n", i, read[0], read[1], Integer.parseInt(read[0]) + Integer.parseInt(read[1])));
        }
        reader.close();
        System.out.println(builder);
    }
}
