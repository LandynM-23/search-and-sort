package sort;

import java.util.Arrays;

/**
 * basic array merge sort in Java
 * @author Landyn
 * @version 1.1.0
 */
public class Merge
{
    public static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];
        System.arraycopy(arr, 0, left, 0, middle);
        System.arraycopy(arr, middle, right, 0, arr.length - middle);
        left = sort(left);
        right = sort(right);
        int leftTwo = 0;
        int rightTwo = 0;
        int i = 0;
        while (leftTwo < left.length && rightTwo < right.length) {
            if (left[leftTwo] < right[rightTwo]) {
                arr[i++] = left[leftTwo++];
            } else {
                arr[i++] = right[rightTwo++];
            }
        }
        while (leftTwo < left.length) {
            arr[i++] = left[leftTwo++];
        }
        while (rightTwo < right.length) {
            arr[i++] = right[rightTwo++];
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
                System.out.println("FAIL at index "+i);
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
        System.out.println("SUCCESS!");
        System.out.println(Arrays.toString(arr)); 
    }
}
