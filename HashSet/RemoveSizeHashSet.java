package HashSet;

import java.util.HashSet;

public class RemoveSizeHashSet{
    public static void main(String[] args) {
        HashSet<String> numbers = new HashSet<String>();

        numbers.add("rice");
        numbers.add("yaw");
        numbers.add("fufu");
        numbers.add("bank");
        numbers.add("okra");

        System.out.println(numbers.size());

        numbers.remove("yaw");

        System.out.println(numbers);
        System.out.println(numbers.size());

        for(String name : numbers){
            System.out.println(name);
        }

        System.out.println(numbers.isEmpty());
    }
}