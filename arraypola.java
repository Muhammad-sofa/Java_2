import java.io.*;
public class arraypola{
	public static void main (String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int [][]polaArray=new int [7][5];
	for(int ulang1=0;ulang1<7;ulang1++){
		for(int ulang2=0;ulang2<5;ulang2++){
		System.out.print("Data Baris-"+(ulang1+1)+" "+"kolom-"+(ulang2+1)+" : ");
		polaArray[ulang1][ulang2] = Integer.parseInt(br.readLine());
		}
	}
	System.out.println(" ");
	System.out.println("================================== Input Pola Array ==================================");
	for(int ulang1=0;ulang1<7;ulang1++){
		for(int ulang2=0;ulang2<5;ulang2++){
			System.out.print(polaArray[ulang1][ulang2]+"  ");
			}
		System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("================================== Output Pola Array ==================================");
		for(int ulang1=0;ulang1<7;ulang1++){
			for(int ulang2=0;ulang2<5;ulang2++){
				if(polaArray[ulang1][ulang2]==1){
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
			}
		System.out.println(" ");
        }
	}
}