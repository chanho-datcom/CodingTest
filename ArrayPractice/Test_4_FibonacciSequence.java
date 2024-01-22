package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Test_4_FibonacciSequence {
    private void solution(int n){
        int[] fibonacciArray = new int[n];
        for(int i=0;i<n;i++){
            if(i>1){
                fibonacciArray[i] = fibonacciArray[i-1]+fibonacciArray[i-2];
            }else{
                fibonacciArray[i] = 1;
            }
            System.out.printf("%d ", fibonacciArray[i]);
        }
    }
    public static void main(String[] args) {
        Test_4_FibonacciSequence main = new Test_4_FibonacciSequence();
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        main.solution(n);
    }
}
