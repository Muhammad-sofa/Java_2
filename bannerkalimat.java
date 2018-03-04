import java.io.*;
class bannerkalimat{
	
	public static final int Abjad[][][]={
		{
		{0,0,1,0,0},//A
		{0,1,0,1,0},
		{1,0,0,0,1},
		{1,1,1,1,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1}
	},
	{
		{1,1,1,0,0},//B
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,1,1,1,0},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,1,1,1,0}
	},
	{
		{0,0,1,1,1},//C
		{0,1,0,0,0},
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,0,0,0,0},
		{0,1,0,0,0},
		{0,0,1,1,1}
	},
	{
		{1,1,1,1,0},//D
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,1,1,1,0}
	},
	{
		{1,1,1,1,1},//E
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,1,1,1,1},
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,1,1,1,1}
	},
	{
		{1,1,1,1,1},//F
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,1,1,0,0},
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,0,0,0,0}
	},
	{
		{0,1,1,1,1},//G
		{1,0,0,0,1},
		{1,0,0,0,0},
		{1,0,1,1,1},
		{1,0,1,0,1},
		{1,0,0,0,1},
		{0,1,1,1,0}
	},
	{
		{1,0,0,0,1},//H
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,1,1,1,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1}
	},
	{
		{0,1,1,1,0},//I
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,1,1,1,0}
	},
	{
		{0,1,1,1,1},//J
		{0,0,0,0,1},
		{0,0,0,0,1},
		{0,0,0,0,1},
		{0,0,0,0,1},
		{0,1,0,0,1},
		{0,0,1,1,0}
	},
	{
		{1,0,0,0,1},//K
		{1,0,0,1,0},
		{1,0,1,0,0},
		{1,1,0,0,0},
		{1,0,1,0,0},
		{1,0,0,1,0},
		{1,0,0,0,1}
		
	},
	{
		{1,0,0,0,0},//L
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,1,1,1,1}
	},
	{
		{1,0,0,0,1},//M
		{1,1,0,1,1},
		{1,0,1,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1}
	},
	{
		{1,0,0,0,1},//N
		{1,1,0,0,1},
		{1,0,1,0,1},
		{1,0,1,0,1},
		{1,0,1,0,1},
		{1,0,0,1,1},
		{1,0,0,0,1}
	},
	{
		{0,1,1,1,0},//O
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{0,1,1,1,0}
	},
	{
		{1,1,1,1,0},//P
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,1,1,1,0},
		{1,0,0,0,0},
		{1,0,0,0,0},
		{1,0,0,0,0}
	},
	{
		{0,1,1,1,0},//Q
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{0,1,1,1,0},
		{0,0,1,1,0},
		{0,0,0,0,1}
	},
	{
		{1,1,1,1,0},//R
		{1,0,0,0,1},
		{1,0,0,1,0},
		{1,1,1,0,0},
		{1,0,0,1,0},
		{1,0,0,1,0},
		{1,0,0,0,1}
	},
	{
		{0,1,1,1,1},//S
		{1,0,0,0,0},
		{1,0,0,0,0},
		{0,1,1,1,0},
		{0,0,0,0,1},
		{0,0,0,0,1},
		{1,1,1,1,0}
	},
	{
		{1,1,1,1,1},//T
		{1,0,1,0,1},
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,0,1,0,0}
	},
	{
		{1,0,0,0,1},//U
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{0,1,1,1,0}
	},
	{
		{1,0,0,0,1},//V
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,0,0,1},
		{0,1,0,1,0},
		{0,0,1,0,0}
	},
	{
		{1,0,0,0,1},//W
		{1,0,0,0,1},
		{1,0,0,0,1},
		{1,0,1,0,1},
		{1,0,1,0,1},
		{1,0,1,0,1},
		{0,1,0,1,0}
	},
	{
		{1,0,0,0,1},//X
		{1,0,0,0,1},
		{0,1,0,1,0},
		{0,0,1,0,0},
		{0,1,0,1,0},
		{1,0,0,0,1},
		{1,0,0,0,1}
	},
	{
		{1,0,0,0,1},//Y
		{0,1,0,1,0},
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,0,1,0,0},
		{0,0,1,0,0}
	},
	{
		{1,1,1,1,1},//Z
		{0,0,0,0,1},
		{0,0,0,1,0},
		{0,0,1,0,0},
		{0,1,0,0,0},
		{1,0,0,0,0},
		{1,1,1,1,1}
	},
	{
	{0,1,1,1,0},// Angka: 0
	{1,0,0,0,1},
	{1,0,0,0,1},
	{1,0,0,0,1},
	{1,0,0,0,1},
	{1,0,0,0,1},
	{0,1,1,1,0}
},
{
	{0,0,1,0,0},// Angka: 1
	{0,1,1,0,0},
	{1,0,1,0,0},
	{0,0,1,0,0},
	{0,0,1,0,0},
	{0,0,1,0,0},
	{1,1,1,1,1}
},
{
	{1,1,1,1,0},// Angka: 2
	{0,0,0,0,1},
	{0,0,0,0,1},
	{0,1,1,1,1},
	{1,0,0,0,0},
	{1,0,0,0,0},
	{1,1,1,1,1}
},
{
	{1,1,1,1,0},// Angka: 3
	{0,0,0,0,1},
	{0,0,0,0,1},
	{1,1,1,1,1},
	{0,0,0,0,1},
	{0,0,0,0,1},
	{1,1,1,1,0}
},
{
	{0,0,0,0,1},// Angka: 4
	{0,0,0,1,1},
	{0,0,1,0,1},
	{0,1,0,0,1},
	{1,1,1,1,1},
	{0,0,0,0,1},
	{0,0,0,0,1}
},
{
	{1,1,1,1,1},// Angka: 5
	{1,0,0,0,0},
	{1,0,0,0,0},
	{1,1,1,1,0},
	{0,0,0,0,1},
	{0,0,0,0,1},
	{1,1,1,1,0}
},
{
	{0,1,1,1,1},// Angka: 6
	{1,0,0,0,0},
	{1,0,0,0,0},
	{1,1,1,1,0},
	{1,0,0,0,1},
	{1,0,0,0,1},
	{1,1,1,1,0}
},
{
	{1,1,1,1,1},// Angka: 7
	{0,0,0,0,1},
	{0,0,0,0,1},
	{0,0,0,1,0},
	{0,0,1,0,0},
	{0,1,0,0,0},
	{1,0,0,0,0}
},
{
	{0,1,1,1,0},// Angka: 8
	{1,0,0,0,1},
	{1,0,0,0,1},
	{1,1,1,1,1},
	{1,0,0,0,1},
	{1,0,0,0,1},
	{0,1,1,1,0}
},
{
	{0,1,1,1,1},// Angka: 9
	{1,0,0,0,1},
	{1,0,0,0,1},
	{0,1,1,1,1},
	{0,0,0,0,1},
	{0,0,0,0,1},
	{1,1,1,1,0}	
},
{
	{0,0,0,0,0},// .
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,1,1,0,0},
	{0,1,1,0,0}	
},
{
	{0,0,0,0,0},// ,
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,1,0},
	{0,0,0,1,0},
	{0,1,1,0,0}	
},
{
	{0,0,1,0,0},// !
	{0,0,1,0,0},
	{0,0,1,0,0},
	{0,0,1,0,0},
	{0,0,1,0,0},
	{0,0,0,0,0},
	{0,0,1,0,0}	
},
{
	{0,0,1,1,0},// ?
	{0,0,0,0,1},
	{0,0,0,0,1},
	{0,0,1,1,0},
	{0,0,1,0,0},
	{0,0,0,0,0},
	{0,0,1,0,0}	
},
{
	{0,1,1,0,0},// :
	{0,1,1,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,1,1,0,0},
	{0,1,1,0,0}	
},
{
	{0,1,1,0,0},// ;
	{0,1,1,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,1,0,0},
	{0,0,1,0,0},
	{0,1,0,0,0}	
},
{
	{0,1,1,0,0,0,1,1,0},// simbol love
	{1,1,1,1,0,1,1,1,1},
	{1,1,1,1,1,1,1,1,1},
	{0,1,1,1,1,1,1,1,0},
	{0,0,1,1,1,1,1,0,0},
	{0,0,0,1,1,1,0,0,0},
	{0,0,0,0,1,0,0,0,0}	
},
{
	{0,0,0,0,0},// -
	{0,0,0,0,0},
	{0,0,0,0,0},
	{1,1,1,1,1},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0}	
},
{
	{0,0,0,0,0},// spasi
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0},
	{0,0,0,0,0}	
}
};
	
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String kali;
		char abjad;
		int h;
		System.out.println(" ");
		System.out.print("Masukan kalimat : ");
		String kalimat = br.readLine();
		kali = kalimat.toUpperCase();
		System.out.println();
		for(int m=0;m<7;m++){
			for(int n=0; n<kali.length(); n++){
				abjad = kali.charAt(n);
				switch(abjad){
					case 'A':
						h=0;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'B':
						h=1;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'C':
						h=2;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'D':
						h=3;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'E':
						h=4;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'F':
						h=5;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'G':
						h=6;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'H':
						h=7;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'I':
						h=8;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'J':
						h=9;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'K':
						h=10;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'L':
						h=11;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'M':
						h=12;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'N':
						h=13;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'O':
						h=14;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'P':
						h=15;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'Q':
						h=16;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'R':
						h=17;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'S':
						h=18;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'T':
						h=19;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'U':
						h=20;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'V':
						h=21;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'W':
						h=22;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'X':
						h=23;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'Y':
						h=24;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'Z':
						h=25;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '0':
						h=26;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '1':
						h=27;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '2':
						h=28;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '3':
						h=29;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '4':
						h=30;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '5':
						h=31;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '6':
						h=32;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '7':
						h=33;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '8':
						h=34;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '9':
						h=35;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '.':
						h=36;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case ',':
						h=37;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '!':
						h=38;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '?':
						h=39;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case ':':
						h=40;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case ';':
						h=41;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '@':
						h=42;
						for(int i=0; i<9;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '-':
						h=43;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case ' ':
						h=44;
						for(int i=0; i<5;i++){
							System.out.print((Abjad[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}