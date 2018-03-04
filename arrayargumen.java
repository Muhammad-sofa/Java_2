import java.util.*;
 public class arrayargumen{
	 public static void main (String[]args){
		 Scanner sc= new Scanner (System.in);
		 int ulang1=1,banyak=0,ulang2=2,a;
		 System.out.print("Masukkan Banyak Argumen: ");
		 banyak=Integer.parseInt(sc.next());
		 System.out.println(" ");
		 String angka[] = new String[banyak+3];
		 do{
			 System.out.print("Masukkan Argument ke-"+ulang1+"= ");
			 angka[ulang1]= sc.next();
			 ulang1++;
			 }
		while(ulang1<=banyak);{
			System.out.println(" ");
			System.out.println(" ");
		    System.out.print("Data yang anda masukkan Anda: "+angka[1]);
		}
		 while(ulang2<=banyak){
			 System.out.print(" , "+angka[ulang2]);
			 ulang2++;
		 }
	 }
}