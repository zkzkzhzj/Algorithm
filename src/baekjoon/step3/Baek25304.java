package baekjoon.step3;

import java.util.Scanner;

public class Baek25304 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int count = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= count; i++) {
            int price = scanner.nextInt();
            int ea = scanner.nextInt();
            sum += price * ea;
        }
        if(total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
