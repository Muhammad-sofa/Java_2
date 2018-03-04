import java.util.*;
 public class rataratatnp{
	 public static void main (String[]args){
		Scanner in = new Scanner (System.in);
		int i = 1;
		int value = 0;
		int jumlah = 0;
        int count = 0;
        int terbesar = Integer.MIN_VALUE;
        int terkecil = Integer.MAX_VALUE;
		int ratarata = 0;
		System.out.println("##################################");
        do{
				System.out.print("Angka ke "+i+"      : ");
				value = Integer.parseInt(in.next());
				i++;
                jumlah = jumlah + value;
                count++;
                ratarata = jumlah/count;
                if (value > terbesar)
                {
                    terbesar = value;
                }
                if (value < terkecil)
                {
                    terkecil = value;
                }
        } while(value>=0);
		System.out.println("===================================");
		System.out.println("===================================");
		System.out.println("Bilangan Terakhir	: " + value);
        System.out.println("Hasil Penjumlahan	: " + jumlah);
		System.out.println("Rata-Rata		: " + (double) ratarata);
        System.out.println("Bilangan Terbesar	: " + terbesar);
        System.out.println("Bilangan Terkecil	: " + terkecil);
        System.out.println("###################################");
    }
}