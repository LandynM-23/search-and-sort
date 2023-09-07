package sort;

import java.util.Arrays;

/**
 * basic array insertion sort in Java
 * @author Landyn
 * @version 1.1.0
 */
public class Insertion
{
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int k = i - 1;
            while (k >= 0 && arr[k] > temp) {
                arr[k + 1] = arr[k];
                k--;
            }
            arr[k + 1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
                31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
                73,54,51,25,33,20,52,79,97,70,54,63,49};    

        testSort(sort(arr));
    }
    public static void testSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                System.out.println("FAIL at i "+i);
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
        System.out.println("SUCCESS!");
        System.out.println(Arrays.toString(arr));
    }
}