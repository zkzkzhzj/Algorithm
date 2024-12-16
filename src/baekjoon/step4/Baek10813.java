package baekjoon.step4;

import java.util.Scanner;

public class Baek10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basket = scanner.nextInt();
        int ballCount = scanner.nextInt();

        int[] baskets = new int[basket];
        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < ballCount; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int temp = baskets[first - 1];
            baskets[first - 1] = baskets[second - 1];
            baskets[second - 1] = temp;
        }

        for (int i : baskets) {
            System.out.print(i + " ");
        }
    }
}
