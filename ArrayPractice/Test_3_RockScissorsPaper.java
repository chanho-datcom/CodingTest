package ArrayPractice;

import java.util.Scanner;

public class Test_3_RockScissorsPaper {
    private void solution(int[] line1, int[] line2){
        String winner;
        for(int i =0;i<line1.length;i++){
            if (line1[i]>line2[i]){
                winner = "A";
                if(line1[i]==3 && line2[i]==1){
                    winner = "B";
                }
            }else if(line1[i]==line2[i]){
                winner = "D";
            }else{
                winner = "B";
                if(line1[i]==1 && line2[i]==3){
                    winner = "A";
                }
            }
            System.out.println(winner);
        }
    }

    public static void main(String[] args) {
        Test_3_RockScissorsPaper main = new Test_3_RockScissorsPaper();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line1 = new int[n];
        int[] line2 = new int[n];
        sc.nextLine();
        for(int i =0;i<n;i++){
            line1[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++){
            line2[j] = sc.nextInt();
        }

        main.solution(line1, line2);
    }
}
