package BTBuoi1;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
		int n;
		int tong=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Nhap n ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				tong+=i;
			}
		}
		System.out.println("tong cac uoc chung cua n la :"+tong);
	}
}
