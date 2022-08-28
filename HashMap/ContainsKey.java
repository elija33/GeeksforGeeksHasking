package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsKey {
    public static void main(String[] args) {
        HashMap<String, Integer> number = new HashMap<String, Integer>();
        number.put("Food", 5);
        number.put("Car", 10);
        number.put("Time", 15);
        number.put("Space", 20);

        System.out.println(number);

        System.out.println();
        System.out.println("Getting the size of the hash");
        System.out.println("_______________________________");

        // Getting the size
        System.out.println("The size of the hash is:" + " " + number.size());
        System.out.println();

        //Travers thought the hashmap
        System.out.println("Print all the key and value of the hash");
        System.out.println("________________________________________");
        for(Map.Entry<String, Integer> name : number.entrySet()){
            System.out.println(name.getKey() + " " + name.getValue());
        }

        System.out.println();

        // Checking if a key contain in the hash
        System.out.println("Checking of key in the hash");
        System.out.println("________________________________");
        if(number.containsKey("rice")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
