package stringPractice;

import java.util.*;
import java.util.stream.Collectors;

public class reverseSpecifyWords_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split("");
        List<Integer> idx = new ArrayList<>();
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].matches("[a-zA-Z]")){
                idx.add(i);
            }
        }

        idx.sort(Comparator.reverseOrder());
        System.out.println(idx);
        System.out.println(strArray.length);
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].matches("[a-zA-Z]")){
                strArray[i] = strArray[idx.get(i)];
            }
        }
        System.out.printf(Arrays.asList(strArray).stream().collect(Collectors.joining()));
    }
}
