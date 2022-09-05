package CountDistinctEleWindow;

public class NaiveCountElementWindow {
    public static void printDistinct(int number[], int target){
        for(int i = 0; i <= number.length - target; i++){
            int count = 0;
            for(int j = 0; j < target; j++){
                boolean flag = false;{
                    for(int p = 0; p < j; p++){
                        if(number[i + j] == number[i + p]){
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false){
                        count++;
                    }
                }
            }
            System.out.print(count+ " ");
        }
    }
    public static void main(String[] args) {
        int number[] = new int[]{10, 10, 5, 3, 20, 5};
        int target = 4;
        printDistinct(number, target);
    }
}
