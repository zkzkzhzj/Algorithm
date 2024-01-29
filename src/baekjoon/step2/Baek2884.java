package baekjoon.step2;

import java.util.Scanner;

public class Baek2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (m < 45) {
            int c = m - 45;
            if(h == 0) {
                System.out.println((23) + " " + (60 + c));
                return;
            }
            System.out.println((h - 1) + " " + (60 + c));
        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
