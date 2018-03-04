import java.util.Scanner;
public class lakiperempuan {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Baris : ");
        int baris = scn.nextInt();
        System.out.print("Kolom : ");
        int kolom = scn.nextInt();
		System.out.println(" ");
        
        int pria=0, wanita=0;
        for(int ulang1=1;ulang1<=baris;ulang1++){
            for(int ulang2=1;ulang2<=kolom;ulang2++){
            System.out.print("----");}
            System.out.println("");
            for(int ulang3=1;ulang3<=kolom;ulang3++){
                System.out.print(+ulang1+"-"+ulang3+" ");}
                System.out.println("");
            double random = 0;
            for(int ulang4=1;ulang4<=kolom;ulang4++){
                random = Math.random();
                if (random > 0.5 ){
                pria++; 
                    System.out.print("-"+"L"+"- ");
                }
                else{
                wanita++;
                    System.out.print("-" +"P" +"- ");        
                }
            }
            
            System.out.println(" ");
        }
        for(int ulang2=1;ulang2<=kolom;ulang2++){
        System.out.print("----");}
        System.out.println(" ");
		System.out.println(" ");
        System.out.println("Total Laki-Laki ( L )   = "+pria);
        System.out.println("Total Perempuan ( P )   = "+wanita);
        System.out.println("Total Keseluruhan       = "+(pria+wanita));
    }
}
