import java.util.Arrays;

public class AddMissingNum {
    public int solution(int[] numbers) {
        int answer = -1;
        int result = Arrays.stream(numbers).sum();
        return 45-result;
    }
}
