
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FruitSeller {
    public static void main(String[] args) {
        FruitSeller fruitSeller = new FruitSeller();
        int[] a = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(fruitSeller.solution(4, 3, a));
    }
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = Arrays.stream(score)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        int a = list.size();
        while(a-m>=0){
            answer += list.get(a-m)*m;
            list = list.subList(0, a-m);
            a -= m;
        }

        return answer;
    }
}
