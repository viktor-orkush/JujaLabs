package week2_4.laba12;

/**
 * Created by Viktor on 17.07.2017.
 */
public class LAB2_2 {
    public static int[] lookFor(int[] array) {
        int[] result ={};
        int start=-1;
        int finish=-1;
        for(int i=0; i<array.length; i++){
            if(array[i]>0 && start == -1){
                start = i;
            }
            if (array[i] <= 0 && start != -1){
                finish = i - 1;
            }
            if (array[i]>0 && i == array.length-1 && start != -1){
                finish = i;
            }
        }
        if(start != -1 || finish != -1){
            result = new int[2];
            result [0] = start;
            result [1] = finish;
        }
        return result;
    }
}
