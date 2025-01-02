package baekjoon.step4;

import java.io.*;

public class Baek10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String basketAndCount = br.readLine();
        // 코드 피드백 : StringTokenizer 클래스를 사용하면 spilit 으로 자르지않고 다음 값을 가져올 수 있다
        // StringTokenizer 를 사용하면 토큰(기본적으로 공백, 띄어쓰기)을 기준으로 잘라서 가져올수있다
        // StringTokenizer st = new StringTokenizer(br.readLine()); st.nextToken(); 으로 사용
        // 참고 : https://www.acmicpc.net/source/88080359
        int[] baskets = new int[Integer.parseInt(basketAndCount.split(" ")[0])];
        int count = Integer.parseInt(basketAndCount.split(" ")[1]);

        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < count; i++) {
            String changeBasket = br.readLine();
            int firstBasket = Integer.parseInt(changeBasket.split(" ")[0]);
            int secondBasket = Integer.parseInt(changeBasket.split(" ")[1]);

            while (firstBasket < secondBasket) {
                int temp = baskets[firstBasket - 1];
                baskets[firstBasket - 1] = baskets[secondBasket - 1];
                baskets[secondBasket - 1] = temp;
                firstBasket++;
                secondBasket--;
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < baskets.length; i++) {
            bw.append(baskets[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
