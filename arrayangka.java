import java.util.*;
 public class arrayangka{
	 public static void main (String[]args){
		 Scanner sc= new Scanner (System.in);
		 int ulang1=1,banyak=0,ulang2=2,a,total=0,rata2=0,Min=1000,Maks=0;
		 System.out.print("Masukkan Banyak Angka :");
		 banyak=Integer.parseInt(sc.next());
		 System.out.println(" ");
		 int angka[] = new int[banyak+3];
		 do{
			 System.out.print("Masukkan Angka ke-"+ulang1+"= ");
			 angka[ulang1]=Integer.parseInt(sc.next());
			 a=angka[ulang1];
			 total=total+angka[ulang1];
			 ulang1++;
			 if(a<=Min){
				 Min=a;
			 }
			 if(a>=Maks){
				 Maks=a;
			 }
		} 
		while(ulang1<=banyak);{
		    rata2=total/banyak;
			System.out.println(" ");
			System.out.println(" ");
		    System.out.print("Data yang anda masukkan Anda: "+angka[1]);
		 }
		 while(ulang2<=banyak){
			 System.out.print(" , "+angka[ulang2]);
			 ulang2++;
		 }
			 System.out.println(" ");
			 System.out.println("Rata-Rata    : " +(double)rata2);
			 System.out.println("Minimum      : "+Min);
			 System.out.println("Maksimum     : "+Maks);
	 }
 }