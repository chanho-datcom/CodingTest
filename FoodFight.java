public class FoodFight {
    public String solution(int[] food) {
        String a = "";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                sb1.append(i);
                sb2.insert(0,i);
            }

        }
        a = sb1+"0"+sb2;
        return a;
    }
}
