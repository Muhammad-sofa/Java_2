import java.util.*;
 public class penjumlahan{
	 public static void main (String[]args){
		 Scanner input = new Scanner (System.in);
	int i=2;
	int bil;
	int sbnyk;
	int h;
	System.out.print("Masukkan Bilangan = ");
	bil = Integer.parseInt(input.next ());
	System.out.print("Sebanyak = ");
	sbnyk = Integer.parseInt(input.next ());
	System.out.println(" ");
	h = bil * sbnyk;
	while (sbnyk >= i){
		System.out.print(bil + "+");
		i++;
	}
		System.out.println(bil + "=" + h);
	 }
 }