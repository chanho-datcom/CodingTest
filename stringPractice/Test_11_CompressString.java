package stringPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test_11_CompressString {
    public String solution(String str){
        int p=1;
        char t = ' ';
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==t){
                p++;
                if(i==str.length()-1){
                    sb.append(p);
                }
            }else{
                if(p>1){
                    sb.append(p);
                }
                sb.append(str.charAt(i));
                p=1;
                t = str.charAt(i);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Test_11_CompressString main = new Test_11_CompressString();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }
}
