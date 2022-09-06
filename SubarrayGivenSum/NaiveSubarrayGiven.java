package SubarrayGivenSum;

public class NaiveSubarrayGiven {
    public static boolean isSum(int number[], int target){
        for(int i = 0; i < number.length; i++){
            int curr = 0;
            for(int j = i; j < number.length; j++){
                curr += number[j];
                if(curr == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int number[] = new int[]{5, 8, 6, 13, 3, -1};
        int target = 22;
        System.out.println(isSum(number, target));
    }
}
