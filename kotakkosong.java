import java.util.Scanner;
public class kotakkosong{
    public static void main(String[] args){
		Scanner input = new Scanner (System.in);
			System.out.print("Inputkan Jumlah Kolom : ");
			int panjang = input.nextInt();
			System.out.print("Inputkan Jumlah Baris : ");
			int lebar = input.nextInt();
			System.out.println("");
            for (int i=1; i <= panjang ; i++){
                if (i != 1 && i != panjang){
                     for (int j=1; j <= lebar ; j++){
                        if (j>1 && j< lebar)
                        {
                            System.out.print(" " + "\t");
                        }
                            else{
                                System.out.print("*" + "\t");
                            }
                    }
                }
                else
                {
                    for (int x=1; x <= lebar ; x++)
                    {
                        System.out.print("*" + "\t");
                    }
                }

                System.out.println("");
            }
    }
}
