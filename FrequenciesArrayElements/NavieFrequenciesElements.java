package FrequenciesArrayElements;

public class NavieFrequenciesElements {
    
    public static void Frequencies(int number[]){
        for(int i = 0; i < number.length; i++){
            boolean flag = false;
            for(int j = 0; j<i; j++){
                if(number[i] == number[j]){
                    flag = true;
                    break;
                }
                if(flag == true){
                    continue;
                }

                int freq = 1;
                for(int k = i + 1; k < number.length; k++){
                    if(number[i] == number[k]){
                        freq++;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
