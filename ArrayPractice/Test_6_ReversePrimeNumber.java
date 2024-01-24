package ArrayPractice;

import java.util.Scanner;

public class Test_6_ReversePrimeNumber {
    private boolean isPrimeNumber(int num){
        if(num < 2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num % i == 0 ){
                return false;
            }
        }
        return true;
    }
    private void reverseNumArray(String[] strArray){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<strArray.length;i++){
            int answer = Integer.parseInt(sb.append(strArray[i]).reverse().toString());
            if(isPrimeNumber(answer)){
                System.out.print(answer + " ");
            }
            sb.delete(0, sb.length());
        }
    }

    public static void main(String[] args) {
        Test_6_ReversePrimeNumber main = new Test_6_ReversePrimeNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray = new String[n];
        for(int i=0;i<n;i++){
            strArray[i] = sc.next();
        }

        main.reverseNumArray(strArray);
    }
}
