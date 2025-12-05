package semester1;
import java.util.*;
public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		int c = 0;
		System.out.println("enter array");
		for(int i=0;i< a.length; i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i< a.length; i++) {
			c+=a[i];
		}
			System.out.println(c);
		}
	}

