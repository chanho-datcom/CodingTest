package ArrayPractice;

import java.util.Scanner;

public class Practice_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<2){
            System.out.println("소수 아님");
        }else if(n==2){
            System.out.println("소수");
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i==0){
                System.out.println("소수 아님");
                return;
            }
        }
        System.out.println("소수");
    }
}
