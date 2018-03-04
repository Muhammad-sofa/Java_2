import java.util.Scanner;
public class loopawalakhir{
	public static void main (String[]args){
	Scanner scn = new Scanner (System.in);
	int awal =0 ;
	int akhir =0 ;
	System.out.print ("Masukkan Awal Loop: ");
	awal = Integer.parseInt(scn.next ());
	System.out.print ("Masukkan Akhir Loop: ");
	akhir = Integer.parseInt(scn.next ());
	while (akhir<awal){
		System.out.println(awal);	
		awal--;	
		}
	while (akhir>=awal)
		{
		System.out.println(awal);
		awal++;	
		}
	}	
}