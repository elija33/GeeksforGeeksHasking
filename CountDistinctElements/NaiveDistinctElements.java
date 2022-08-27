package CountDistinctElements;

public class NaiveDistinctElements {

    public static int countDist(int number[]){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            boolean flag = false;
            for(int j = 0; j<i; j++){
                if(number[i] == number[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
