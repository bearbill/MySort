import com.xiong.Heapsort.Heapsort;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       int[] a = {5,8,1,4,9,6,3};
       int[] b =  Heapsort.heapSort(a);
        System.out.println(Arrays.toString(b));
    }
}
