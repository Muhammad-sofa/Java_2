import java.util.Scanner;
public class arraygraphic{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ulang1=0,maks1=0;
	System.out.print("Masukkan banyak data : ");
        int banyak = sc.nextInt();	
		int[] data = new int[banyak];
		System.out.println(" ");
	while(ulang1<banyak){
		System.out.print("Data ke-"+(ulang1+1)+" : ");
		data[ulang1] = sc.nextInt();
		if (maks1<data[ulang1]){
			maks1=data[ulang1];
		}
		ulang1++;
	}
	int maks2=maks1;
	for (int ulang2= 0; ulang2<maks1; ulang2++) {
		System.out.print(maks2+"     | ");
        for (int ulang3=0; ulang3<banyak; ulang3++) {
            if(data[ulang3]==maks2){
			System.out.print("* ");
			data[ulang3]=data[ulang3]-1;
			}
			else{
			System.out.print("  ");		
			}	}
		System.out.println("");		
		maks2--;
	}
	System.out.println("===============================");
	System.out.print("Data Ke ");
	ulang1=0;
	while(ulang1<banyak){
	System.out.print((ulang1+1)+" ");
	ulang1++;
	}	}	}