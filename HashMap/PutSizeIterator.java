package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PutSizeIterator {
    public static void main(String[] args) {
        // Creating hashmap
        HashMap<String, Integer> number = new HashMap<String, Integer>();
        number.put("car", 10);
        number.put("food", 15);
        number.put("Rice", 20);
        number.put("fufu", 25);
        number.put("rice", 30);

        //print out all the hashmap 
        System.out.println(number);

        // Getting the size of hashmap
        System.out.println(number.size());

        // Checking for a key
        if(number.containsKey("rice")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println();

        //Travers thought the hashmap
        for(Map.Entry<String, Integer> name : number.entrySet()){
            System.out.println(name.getKey() + " " + name.getValue());
        }

        System.out.println();

        // Remove key "ide" and returns the associated value 15
        number.remove("car");
        number.remove("yaw");
        System.out.println(number);
        System.out.println(number.size());

        // Checking for a value in hashmap
        if(number.containsValue(20)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //Get value corresponding to passed key <"ide", 15>
        System.out.println(number.get("fufu"));

        //The given key is absent
        System.out.println(number.get("practice"));
    }
}
