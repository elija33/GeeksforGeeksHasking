package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsValue {
    public static void main(String[] args) {
        HashMap<String, Integer> number = new HashMap<>();
        number.put("Elija", 10);
        number.put("Ruth", 9);
        number.put("Kenny", 8);
        number.put("Anita", 7);
        number.put("Mom", 6);
        number.put("Family", 5);
        System.out.println(number);

        System.out.println();

        System.out.println("Print all the key and value of the hash");
        System.out.println("_________________________________________");
        for(Map.Entry<String, Integer> name : number.entrySet()){
            System.out.println(name.getKey()+ " " + name.getValue());
        }

        System.out.println();
        System.err.println("The size of the hash Map");
        System.out.println("_____________________________");
        System.out.println(number.size());

        System.out.println();
        System.out.println("Checking for the value of the hash");
        System.out.println("_______________________________________");
        if(number.containsValue(15)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
