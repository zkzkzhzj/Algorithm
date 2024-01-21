package baekjoon.step1;

import java.util.Scanner;

public class Baek2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println((second % 10) * first);
        System.out.println(((second % 100) / 10) * first);
        System.out.println((second / 100) * first);
        System.out.println(first * second);
    }
}
