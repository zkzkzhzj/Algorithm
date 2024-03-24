package baekjoon.step3;

import java.io.*;

public class Baek15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String num = reader.readLine();
            String[] cutNum = num.split(" ");
            writer.write((Integer.parseInt(cutNum[0]) + Integer.parseInt(cutNum[1])) + "\n");
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}
