package FrequenciesArrayElements;

import java.util.HashMap;
import java.util.Map;

public class HashMapFrequencies {
    public static void countFreq(int number[]){
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        for(int i = 0; i < number.length; i++){
            int key = number[i];
            if(numbers.containsKey(number[i]) == true){
                numbers.put(number[i], numbers.get(number[i]) + 1);
            }
            else{
                numbers.put(number[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> name: numbers.entrySet()){
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }
    public static void main(String[] args) {
        int number[] = new int[]{15, 16, 27, 27, 28, 15, 16};

        countFreq(number);
    }
}
