package ArrayPractice;

import java.util.Scanner;

public class Test_2_VisibleStudent {
    private int solution(int[] intArray){
        int compareNum = 0;
        int count=0;
        for(int i =0;i<intArray.length;i++){
            if(intArray[i]>compareNum){
                count++;
                compareNum = intArray[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Test_2_VisibleStudent main = new Test_2_VisibleStudent();
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
