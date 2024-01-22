package ArrayPractice;

import java.util.Scanner;

public class Test_1_PrintBigNumber {
    private String solution(int[] intArray){
        int compareNum = 0;
        StringBuilder sb= new StringBuilder();
        for(int i =0;i<intArray.length;i++){
            if(intArray[i]>compareNum){
                sb.append(String.format("%d ", intArray[i]));
            }
            compareNum = intArray[i];
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Test_1_PrintBigNumber main = new Test_1_PrintBigNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[n];
        sc.nextLine();
        for(int i =0;i<n;i++){
            line[i] = sc.nextInt();
        }

        System.out.println(main.solution(line));
    }
}
