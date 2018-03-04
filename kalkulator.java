import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int ulang1, ulang2;
		System.out.println(" ");
		System.out.println(" ");
		for(ulang1=1; ulang1<=10; ulang1++)
			{
				System.out.print("\n");
				for(ulang2=1; ulang2<=10; ulang2++)
				{
					System.out.print(ulang2+ "x" + ulang1 + "= " + ulang1 * ulang2 + (" "));
				}
				System.out.print("\n");
			}       
    }
}