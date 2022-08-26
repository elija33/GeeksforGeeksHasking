package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAdding {
    public static void main(String[] args) {
        HashSet<String> number = new HashSet<String>();

        number.add("gfg");
        number.add("courses");
        number.add("math");
        number.add("English");

        System.out.println(number);
        System.out.println(number.contains("math"));
        System.out.println(number.contains("twi"));

        for(String name : number){
            System.out.println(name);
        }

        /*Iterator<String> name = number.iterator();
        
        while(name.hasNext()){
            System.out.println(name.next()+ " ");
        }*/
    }
    
}
