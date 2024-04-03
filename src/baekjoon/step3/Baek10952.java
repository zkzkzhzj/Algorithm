package baekjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        boolean check;
        while (true) {
            String[] numList = reader.readLine().split(" ");
            check = Arrays.stream(numList).allMatch(num -> num.equals("0"));
            if (check) break;
            builder.append(Integer.parseInt(numList[0]) + Integer.parseInt(numList[1])).append("\n");
        }
        System.out.print(builder);
    }
}
