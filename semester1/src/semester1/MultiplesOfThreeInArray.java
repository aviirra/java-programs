package semester1;

public class MultiplesOfThreeInArray {
public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12};
		printmultiple(arr);
}
	public static int printmultiple(int arr[]) {
		int multiples = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				multiples++;
			}
		}
		System.out.println("numbers divisible by 3 are : " + multiples);
		return multiples;

	}
}
