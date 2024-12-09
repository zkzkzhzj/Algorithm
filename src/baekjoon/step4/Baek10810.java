package baekjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10810 {

    public static void main(String[] args) throws IOException {
        // Scanner 로도 사용 가능
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Scanner 사용시 nextInt 로 자르지 않고 가져올 수 있다.
        String baseInput = reader.readLine();
        int basketSize = Integer.parseInt(baseInput.split(" ")[0]);
        int[] basket = new int[basketSize];
        int ballCont = Integer.parseInt(baseInput.split(" ")[1]);

        // 조건에 따라 공을 넣을 횟수만큼 반복
        for (int i = 0; i < ballCont; i++) {
            String ballInput = reader.readLine();
            int startBasket = Integer.parseInt(ballInput.split(" ")[0]);
            int endBasket = Integer.parseInt(ballInput.split(" ")[1]);
            int ballNumber = Integer.parseInt(ballInput.split(" ")[2]);

            // 바스켓에 공 채우기
            for (int y = startBasket - 1; y < endBasket; y++) {
                basket[y] = ballNumber;
            }
        }

        for(int x = 0 ; x < basketSize ; x++) {
            System.out.print(basket[x] + " ");
        }
    }
}
