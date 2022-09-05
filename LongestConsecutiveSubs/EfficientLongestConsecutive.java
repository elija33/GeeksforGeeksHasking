package LongestConsecutiveSubs;
import java.util.HashSet;

public class EfficientLongestConsecutive {

    public static int findLongest(int number[])
    {
        HashSet<Integer> s = new HashSet<>();
        int res = 0;
     
        for (int i = 0; i < number.length; i++)
            s.add(number[i]);
     
        for (int i = 0; i < number.length; i++) {
            if (!s.contains(number[i] - 1)) {
                int curr = 1;
                while (s.contains(curr + number[i]))
                    curr++;
                    
                res = Math.max(res, curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int number[] = new int[]{1, 9, 3, 4, 2, 10, 13};
        System.out.println(findLongest(number));
    }
}
