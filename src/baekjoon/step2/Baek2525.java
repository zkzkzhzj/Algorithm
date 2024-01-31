package baekjoon.step2;

import java.util.Scanner;

public class Baek2525 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int cook = scanner.nextInt();

        int endCook = minute + cook;
        int plusHour = endCook / 60;

        int cookHour = hour + plusHour;
        int cookMinute = endCook % 60;

        System.out.println((cookHour % 24) + " " + cookMinute);
    }
}
