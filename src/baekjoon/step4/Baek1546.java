package baekjoon.step4;

import java.io.*;
import java.util.StringTokenizer;

public class Baek1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double highScore = 0;
        double avg = 0;

        // 코드 피드백 : 굳이 StringTokenizer 사용하지 않고 spilit 으로 바로 subjectScores 에 담을 수 있다(현재 두번 일하기)
        // 참고 : https://www.acmicpc.net/source/88098997
        int subjectCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] subjectScores = new double[subjectCount];

        for (int i = 0; i < subjectCount; i++) {
            subjectScores[i] = Double.parseDouble(st.nextToken());
            if (highScore < subjectScores[i]) {
                highScore = subjectScores[i];
            }
        }

        for (double subjectScore : subjectScores) {
            avg += (subjectScore/highScore) * 100;
        }

        bw.append(avg/subjectCount+"");
        bw.flush();
        bw.close();
        br.close();
    }
}

// 단계별 풀이 그만두기(내가 풀 문제들이 아님) - solved.ac 사용하여 풀자
