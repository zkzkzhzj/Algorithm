package baekjoon.step3;

import java.util.Scanner;

public class Baek25314 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 0; i < num/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
