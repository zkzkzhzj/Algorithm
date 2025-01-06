package baekjoon.silver.step4;

import java.io.*;
import java.util.Arrays;

public class Baek1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int customerCount = Integer.parseInt(br.readLine());
        int[] tip = new int[customerCount];
        long sum = 0;
        for (int i = 0; i < customerCount; i++) {
            int customerTip = Integer.parseInt(br.readLine());
            tip[i] = customerTip;
        }

        Arrays.sort(tip);

        for (int i = tip.length - 1; i >= 0; i--) {
            int customerTip = tip[i] - (customerCount - i - 1);
            if (customerTip >= 0) {
                sum += customerTip;
            }
        }

        bw.append(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
