import java.util.Scanner;
public class Login {
	public static void main (String [] argx){
	
	System.out.println(" ");
	String user, pass;
	Scanner in = new Scanner(System.in);
	System.out.print ("Username :");
	user = in.nextLine ();
	System.out.print ("Password :");
	pass = in.nextLine();
	if (user.equals("Devi")&&pass.equals("admin"))
		System.out.print ("==========Login Anda Berhasil, Selamat Datang==========");
	else
		System.out.print ("===Ada Kesalahan Pada Login Anda, Silahkan Coba Lagi===");
	in.close();
	System.out.println(" ");
	}
}
