package cure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CleanRepeatingElement {
	public static void main(String[] args) {
		int[]arr = {5,5,9,9,6,6,3,2,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(clean(arr));
		System.out.println(clean2(arr));
		System.out.println(clean3(arr));
	}
	public static HashSet<Integer> clean(int arr[]) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i = 0 ; i<arr.length;i++) {
			hashSet.add(arr[i]);
		}
		return hashSet;
	}
	public static List<Integer> clean2(int arr[]){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<arr.length;i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		 return list ;
	}
	public static Set<Integer> clean3(int arr[]){
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<arr.length;i++) {
			set.add(arr[i]);
		}
		return set;
	}
}
