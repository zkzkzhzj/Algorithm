package baekjoon.step2;

import java.util.Scanner;

public class Baek2480 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a == b && b == c) {
            System.out.println(10000 + (a * 1000));
            return;
        }
        if(a == b || a == c || b == c) {
            if(a == b || a == c) {
                System.out.println(1000 + (a * 100));
                return;
            }
            if(b == c) {
                System.out.println(1000 + (b * 100));
                return;
            }
        }
        if(a > b && a > c) {
            System.out.println(a * 100);
            return;
        }
        if(b > a && b > c) {
            System.out.println(b * 100);
            return;
        }
        if(c > b && c > a) {
            System.out.println(c * 100);
        }
    }
}
