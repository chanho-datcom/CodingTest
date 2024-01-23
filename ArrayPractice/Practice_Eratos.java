package ArrayPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practice_Eratos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] primeNumberArr = new boolean[N + 1];
        primeNumberArr = primeNumberChecked(primeNumberArr, N);

        for (int i = 1; i <= N; i++) {
            if (!primeNumberArr[i])
                System.out.println(i);
        }

    }

    static boolean[] primeNumberChecked(boolean[] b, int n) {
        b[0] = true; // 소수면 false, 소수가 아니면 true
        b[1] = true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!b[i]) {
                for (int j = i * i; j <= n; j += i) { // 2를 예를 들면 2를 제외한 2의 배수는 2로 나뉘어지니 소수가 아님
                    b[j] = true;
                }
            }
        }
        return b;
    }
}
