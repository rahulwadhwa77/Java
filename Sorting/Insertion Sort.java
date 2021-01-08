package revision;

import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {18, 11, 9, 3, 5};
		System.out.println("Array after each swap: ");
		for (int i = 1; i < arr.length; ++i) { 
            		int key = arr[i];   		//element that is being compared
            		int j = i - 1; 
  
            		while (j >= 0 && arr[j] > key) { 
                		arr[j + 1] = arr[j]; 
                		j = j - 1; 
            		} 
            		arr[j + 1] = key; 
            
            		System.out.println(Arrays.toString(arr));
        	} 
		System.out.println("\nFinal Sorted array: ");
		System.out.println(Arrays.toString(arr));
	}

}