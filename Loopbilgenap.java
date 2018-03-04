import java.util.Scanner;
public class Loopbilgenap{ 
	public static void main(String[] args){ 
		Scanner scn = new Scanner (System.in);
		System.out.print ("Masukkan Angka = ");
		int angka = Integer.parseInt(scn.next ());
		int Genap=0;
		int ulang=0;
		while (angka>=ulang){
			System.out.print("ke = "+ulang+"\t");
			ulang++;
			System.out.println ("- Bilangan genap="+Genap);
			Genap = Genap +=2;
		}
	}
}