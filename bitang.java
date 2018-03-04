import java.util.Scanner;
public class bitang {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan angka : ");
		c = scan.nextInt();
		System.out.println("");
		for(a=1;a<=c;a++){
			for(b=(c-a);b>0;b--){
				System.out.print("*");
			}
			for(b=1;b<=a;b++){
				System.out.print("-");
			}
			System.out.println();
		}
	}
}