import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class HallOfFame {
    public static void main(String[] args) {
        int[] a = {10, 100, 20, 150, 1, 100, 200};
        HallOfFame hallOfFame = new HallOfFame();
        int[] b = hallOfFame.solution(3, a);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<score.length;i++){
           list.add(score[i]);
           list = list.stream().sorted().collect(Collectors.toList());
           if(list.size()>k){
               answer[i] = list.get(list.size()-k);
           }else{
               answer[i] = list.get(0);
           }

        }


        return answer;
    }
}
