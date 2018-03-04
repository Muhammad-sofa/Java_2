import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kalimatbanner {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int source[][][] = {
            {
                {0, 0, 1, 1, 0, 0},//A
                {0, 1, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1}
            },
            {
                {1, 1, 1, 1, 0, 0},//B
                {1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 1, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {0, 1, 1, 1, 1, 1},//C
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1}
            },
            {
                {1, 1, 1, 1, 0, 0},//D
                {1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0, 0}
            },
            {
                {1, 1, 1, 1, 1, 1},//E
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {1, 1, 1, 1, 1, 1},//F
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0}
            },
            {
                {0, 1, 1, 1, 1, 1},//G
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {1, 0, 0, 0, 0, 1},//H
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1}
            },
            {
                {1, 1, 1, 1, 1, 1},//I
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {0, 1, 1, 1, 1, 0},//J
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {0, 1, 1, 1, 1, 1}
            },
            {
                {1, 0, 0, 0, 0, 1},//K
                {1, 0, 0, 0, 1, 0},
                {1, 0, 0, 1, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 1}
            },
            {
                {1, 0, 0, 0, 0, 0},//L
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {1, 0, 0, 0, 0, 1},//M
                {1, 1, 0, 0, 1, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1}
            },
            {
                {1, 0, 0, 0, 0, 1},//N
                {1, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 0, 0, 1, 1, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 1}
            },
            {
                {0, 1, 1, 1, 1, 0},//O
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 0}
            },
            {
                {1, 1, 1, 1, 1, 0},//P
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0}
            },
            {
                {0, 1, 1, 1, 1, 0},//Q
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 1}
            },
            {
                {1, 1, 1, 1, 1, 0},//R
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 0},
                {1, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 1, 1}
            },
            {
                {1, 1, 1, 1, 1, 1},//S
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {1, 1, 1, 1, 1, 1},//T
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0}
            },
            {
                {1, 0, 0, 0, 0, 1},//U
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {1, 0, 0, 0, 0, 1},//V
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0}
            },
            {
                {1, 0, 0, 0, 0, 1},//W
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 1, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 1}
            },
            {
                {1, 0, 0, 0, 0, 1},//X
                {1, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {1, 1, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 1}
            },
            {
                {1, 0, 0, 0, 0, 1},//Y
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0}
            },
            {
                {1, 1, 1, 1, 1, 1},//Z
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {0, 1, 1, 1, 1, 0},//0 zero
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 0}
            },
            {
                {0, 0, 0, 1, 0, 0},//1
                {0, 0, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {0, 1, 1, 1, 1, 0},//2
                {1, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {0, 1, 1, 1, 1, 0},//3
                {1, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 0}
            },
            {
                {0, 0, 0, 1, 0, 0},//4
                {0, 0, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 1, 1, 1, 0}
            },
            {
                {1, 1, 1, 1, 1, 1},//5
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
            },
            {
                {0, 0, 0, 0, 1, 1},//6
                {0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 1},
                {0, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 1}
            },
            {
                {0, 1, 1, 1, 1, 1},//7
                {1, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0}
            },
            {
                {0, 1, 1, 1, 1, 0},//8
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 0}
            },
            {
                {0, 1, 1, 1, 1, 0},//9
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0},
                {1, 1, 1, 0, 0, 0}
            },
            {
                {0, 0, 0, 0, 0, 0},//space
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
            },};
        System.out.println("Input menggunakan huruf kecil");
        System.out.println("-----------------------------");
        System.out.println(" ");
        System.out.print("Input text : ");
        String text = input.readLine();
        System.out.println(" ");
        
        int page = 0;
        char alpha;

        for (int row = 0; row < 7; row++) { //row akan menampilkan bintang2 pada baris pertama dalam satu kalimat
            for (int i = 0; i < text.length(); i++) {//var i digunakan utk membatasi tampilan bintang hanya pada abjad yang sesuai
                alpha = text.charAt(i);//a
                switch (alpha) {
                    case 'A':
                        page = 0;
                        //looping pada coloumn menampilkan value dari setiap baris
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'b':
                        page = 1;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'c':
                        page = 2;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'd':
                        page = 3;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'e':
                        page = 4;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'f':
                        page = 5;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'g':
                        page = 6;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'h':
                        page = 7;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'i':
                        page = 8;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'j':
                        page = 9;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'k':
                        page = 10;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'l':
                        page = 11;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'm':
                        page = 12;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'n':
                        page = 13;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'o':
                        page = 14;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'p':
                        page = 15;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'q':
                        page = 16;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'r':
                        page = 17;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 's':
                        page = 18;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 't':
                        page = 19;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'u':
                        page = 20;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'v':
                        page = 21;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'w':
                        page = 22;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'x':
                        page = 23;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'y':
                        page = 24;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case 'z':
                        page = 25;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '0':
                        page = 26;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '1':
                        page = 27;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '2':
                        page = 28;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '3':
                        page = 29;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '4':
                        page = 30;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '5':
                        page = 31;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '6':
                        page = 32;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '7':
                        page = 33;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '8':
                        page = 34;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    case '9':
                        page = 35;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");
                        break;
                    default:
                        page = 36;
                        for (int coloumn = 0; coloumn < 6; coloumn++) {
                            System.out.print((source[page][row][coloumn] == 1) ? "#" : " ");
                        }
                        System.out.print("\t");

                }
            }
            System.out.println("");
        }

    }
}
