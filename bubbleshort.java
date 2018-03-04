import java.util.Scanner;
public class bubbleshort {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("==========Bubble Shot==========");
		System.out.println(" ");
	System.out.print("Masukkan Banyak Angka :");
	int banyak = sc.nextInt ();
	int[] angka = new int[banyak];
		System.out.println(" ");
	for(int ulang1= 0; ulang1<banyak; ulang1++){
		System.out.print("Masukkan Angka ke-" +(ulang1+1)+" : ");
		angka[ulang1] = sc.nextInt ();
		}
	for(int ulang2= 0; ulang2<(banyak-1); ulang2++){
		for(int ulang3= ulang2+1; ulang3<banyak; ulang3++) {
			if(angka[ulang2] > angka[ulang3]) {
				int temp = angka[ulang2];
				angka[ulang2] = angka[ulang3];
				angka[ulang3] = temp;				
			}
		}
	}
	System.out.println("\n\n***Data Setelah Diurutkan Dengan Bubble Short***");
		System.out.println(" ");
	for(int ulang4=0; ulang4<banyak; ulang4++){
		System.out.print(angka[ulang4]+" ");
		}
	}
}