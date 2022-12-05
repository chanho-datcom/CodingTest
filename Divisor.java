public class Divisor {
    public static void main(String[] args) {
        int a = 1000000000;
        int sqrt = (int)Math.sqrt(1000000000);
        int cnt=0;

        for(int i=1;i<=sqrt;i++){
            if(a%i==0){
                cnt++;
                if(a/i!=i){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }




}
