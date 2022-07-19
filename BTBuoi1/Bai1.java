package BTBuoi1;

import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		int Ngay;
		int Thang;
		int Nam;
		Scanner sc= new Scanner (System.in);
		do {
			System.out.println("Nhap ngay sinh cua ban:");
			Ngay=sc.nextInt();
		}while((Ngay<=0)||(Ngay>31));
		do {
			System.out.println("Nhap thang sinh cua ban:");
			Thang=sc.nextInt();
		}while((Thang<=0)||(Thang>12));
		do {
			System.out.println("Nhap nam sinh cua ban:");
			Nam=sc.nextInt();
		}while(Nam>=2022);
		if((Ngay>=20&&Thang==1)||(Ngay<=18&&Thang==2))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Bao Binh");
		
		else if((Ngay>=19&&Thang==2)||(Ngay<=20&&Thang==3))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Song Ngu");
		
		else if((Ngay>=21&&Thang==3)||(Ngay<=20&&Thang==4))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Bach Duong");
		
		else if((Ngay>=21&&Thang==4)||(Ngay<=20&&Thang==5))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Kim Nguu");
		
		else if((Ngay>=21&&Thang==5)||(Ngay<=21&&Thang==6))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Song Tu");
		
		else if((Ngay>=22&&Thang==6)||(Ngay<=22&&Thang==7))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Cu Giai");
		
		else if((Ngay>=23&&Thang==7)||(Ngay<=22&&Thang==8))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Su Tu");
		
		else if((Ngay>=23&&Thang==8)||(Ngay<=22&&Thang==9))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Xu Nu");
		
		else if((Ngay>=23&&Thang==9)||(Ngay<=23&&Thang==10))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Thien Binh");
		
		else if((Ngay>=24&&Thang==10)||(Ngay<=22&&Thang==11))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Bo Cap");
		
		else if((Ngay>=23&&Thang==11)||(Ngay<=21&&Thang==12))
			System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Nhan Ma");
		
		else System.out.println(Ngay+"/"+Thang+"/"+Nam+ " Thuoc cung Song Ngu");
		
		
	}
}
