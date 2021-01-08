//BinarySearch works only on sorted collection.

package revision;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {2, 5, 8, 9, 11, 19, 23};
		int findElement = 8;
		int li = 0;					//initialized lower index
		int ui = arr.length - 1;			//initialized upper index
		boolean flag = false;
		while(li <= ui) {
			int mid = (li + ui) / 2;
			if(arr[mid] == findElement) {
				System.out.println("Element " +findElement+ " is at index: " +mid);
				flag = true;
				break;
			}
			else if(arr[mid]>findElement) {
				ui = mid - 1;
			}
			else{
				li = mid + 1;
			}
		}
		if(!flag) {
			System.out.println("Element not found");
		}
	}

}