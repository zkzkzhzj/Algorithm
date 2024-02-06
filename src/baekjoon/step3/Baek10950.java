package baekjoon.step3;

import java.util.Scanner;

public class Baek10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for(int i = 1; count >= i; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.println(first + second);
        }
    }
}