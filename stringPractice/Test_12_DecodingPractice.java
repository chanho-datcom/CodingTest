package stringPractice;

import java.util.Scanner;

public class Test_12_DecodingPractice {
//    public String solution(String encodedStr){
//        int decimalNum = 0;
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<encodedStr.length();i++){
//            if(encodedStr.charAt(i)=='#'){
//                decimalNum += turnBinaryToDecimal(i);
//            }
//            if(i%7==6){
//                char a = (char) decimalNum;
//                sb.append(a);
//                decimalNum = 0;
//            }
//        }
//        return sb.toString();
//    }
//    public static void main(String[] args) {
//        Test_12_DecodingPractice main = new Test_12_DecodingPractice();
//        Scanner sc = new Scanner(System.in);
//        String answer;
//        int countWords = sc.nextInt();
//        sc.nextLine();
//        String encodedStr = sc.nextLine();
//        if((encodedStr.length()/7)!=countWords){
//            throw new RuntimeException();
//        }else{
//            answer = main.solution(encodedStr);
//        }
//        System.out.println(answer);
//
//    }
//
//    private int turnBinaryToDecimal(int i){
//        int binaryDigits = i%7;
//        int decimalNum = 0;
//        switch (binaryDigits){
//            case 0:
//                decimalNum = (int) Math.pow(2, 6);
//                break;
//            case 1:
//                decimalNum = (int) Math.pow(2, 5);
//                break;
//            case 2:
//                decimalNum = (int) Math.pow(2, 4);
//                break;
//            case 3:
//                decimalNum = (int) Math.pow(2, 3);
//                break;
//            case 4:
//                decimalNum = (int) Math.pow(2, 2);
//                break;
//            case 5:
//                decimalNum = (int) Math.pow(2, 1);
//                break;
//            case 6:
//                decimalNum =1;
//                break;
//        }
//
//        return decimalNum;
//    }
}
