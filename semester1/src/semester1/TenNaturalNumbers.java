package semester1;
import java.util.Scanner;

public class TenNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sumOfNaturals=0;
		for(int i=1;i<=10;i++) {
			sumOfNaturals=sumOfNaturals+i;
		}
		
		System.out.println("sum"+sumOfNaturals);
		int num=sc.nextInt();
		int digitSum=0;
		while(num>0) {
			digitSum=digitSum+(num%10);
			num=num/10;
		}
		System.out.println("sum of the digits"+digitSum);
		
	}		

}
