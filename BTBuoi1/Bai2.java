package BTBuoi1;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Nhap canh a");
			a=sc.nextInt();	
		}while(a<=0);
		do {
			System.out.println("Nhap canh b");
			b=sc.nextInt();	
		}while(b<=0);
		do {
			System.out.println("Nhap canh c");
			c=sc.nextInt();	
		}while(c<=0);
		if(a+b>c||a+c>b||b+c>a) {
			System.out.println("day la mot tam giac");
			if((a==b)||(b==c)||(c==a))
				System.out.println("cu the day la mot tam giac can");
			if(a==b&&a==c&&b==c)
				System.out.println("cu the day la mot tam giac deu");
			if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)
			System.out.println("cu theday la tam giac vuong");
		}
		else System.out.println("day khong phai la tam giac");
			
	}

}
