import java.util.Scanner;
public class angkakotak {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
		int pjg, lbr;
		System.out.print("Masukkan Jumlah Kolom : ");
		pjg = input.nextInt();
		System.out.print("Masukkan Jumlah Baris : ");
		lbr = input.nextInt();
		System.out.println("");
		int a = 1;
			for (int b = 0; b < lbr; b++) {
            for (int c = 0; c < pjg; c++) {
			System.out.print(a++ + "\t" );
            }
            System.out.println("");
		}
	}
}