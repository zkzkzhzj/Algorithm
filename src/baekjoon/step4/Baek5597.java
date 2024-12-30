package baekjoon.step4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Baek5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 과제를 제출한 학생 리스트
        int[] students = new int[28];
        // 전체 출석부
        int[] checkList = new int[30];
        for (int i = 1; i <= 30; i++) {
            checkList[i - 1] = i;
        }

        for (int i = 0; i < students.length; i++) {
            int studendNumber = scanner.nextInt();
            // 출석부 번호는 1~30
            if (studendNumber >= 1 && studendNumber <= 30) {
                // 중복된 출석번호는 없다(set 사용도 생각해보기)
                if (Arrays.stream(students).noneMatch(data -> data == studendNumber)) {
                    students[i] = studendNumber;
                } else {
                    i--;
                }
            } else {
                i--;
            }
        }

        // 출석부 기준으로 제출한 학생 리스트를 조회하며 없는 번호를 리스트로 만들기
        List<Integer> notSendStudents = Arrays.stream(checkList)
                .filter(value -> Arrays.stream(students).noneMatch(x -> x == value)).boxed()
                .collect(Collectors.toList());

        notSendStudents.forEach(System.out::println);
    }
}

/**
 * 다른분의 코드
 * 내가 구현을 너무 복잡하게 생각했다.
 * 배열을 만들고 모든 값을 0으로 대체한 후 입력받은걸 1을 넣어주고 0인 값을 출력해준다.
 * 정말 간단하고 좋은 방법이다.
 *
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 * // 배열
 * int[] arr = new int[31];
 * Arrays.fill(arr,0);
 *
 * for(int i=0; i<28; i++) {
 *   int info = Integer.parseInt(br.readLine());
 *   arr[info] = 1;
 * }
 *
 * for(int i=1; i<=30; i++) {
 *   if(arr[i] == 0) {
 *     System.out.println(i);
 *   }
 * }
 */