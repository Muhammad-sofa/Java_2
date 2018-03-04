import java.util.Scanner;
public class whileawal{
	public static void main (String []strs){
		System.out.print("Masukkan Bilangan = ");
		Scanner mb=new Scanner(System.in);
		int n=mb.nextInt();
		int i=1;
		while(i <= n){
			System.out.println(i);
			i= i + 2;
		}
		mb.close();
		System.out.println("Di Luar While");
	}
}