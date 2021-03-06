import java.io.*;
public class inputdatapenjualan {

    public static void main(String[] args) throws IOException{
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu"};
        String[] namaBarang = {"Pensil 2B", "Buku Tulis", "Penggaris", "Penghapus"};
        int[][] dataJual = new int[4][6];
  
        System.out.println("Data Penjualan");
        System.out.println(" ");
            BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
            try {
            for (int i = 0; i < dataJual.length; i++) {
                for (int j = 0; j < dataJual[i].length; j++) {
                    System.out.print("Jumlah penjualan "+namaBarang[i]+ " hari " +namaHari[j]+" : ");
                    dataJual[i][j]=Integer.parseInt(in.readLine());
                }
            }
        } catch (Exception e) {
            System.out.println("DATA HARUS BERUPA ANGKA");
        }
            System.out.println(" ");
        
        System.out.print("Barang-hari " + "\t");
        
        //menampilkan hari Senin - Sabtu
        for (int i = 0; i < namaHari.length; i++) {
            System.out.print(namaHari[i] + "\t");
        }
        System.out.print("Total\t");
        System.out.println("Persentase");
        System.out.println(" ");
        
        int total = 0;
        int totalsemua = 0;
        int persen = 0;
        int [] totalHari = new int[6];
        int a = 0;
        String lakuBanyak ="";
        
        //menampilkan jumlah barang yang dibeli di setiap harinya
        for (int j = 0; j < namaBarang.length; j++) {
            System.out.print(namaBarang[j] + "\t");
            for (int k = 0; k < 6; k++) {
                System.out.print(dataJual[j][k] + "\t");
                total += dataJual[j][k];
                totalHari [k]+= dataJual[j][k];
                if (total> a ) {
                    a = total;
                    lakuBanyak = namaBarang[j];
                }
                persen = total * 100 / 70;
            }
            totalsemua +=total;
            System.out.print(total + "\t");
            System.out.print(persen + "%");
            total = 0;
            System.out.println(" ");
            
        }
        System.out.print("Total"+"\t"+"\t");
        for (int q = 0; q < 6; q++) {
            System.out.print(totalHari[q]+"\t");
        }
        System.out.print(totalsemua);
        
        //mencari barang paling laku
        int max = 0;
        int[] temp = new int[4];
        int[] maxbarang = new int[4];
        for (int m = 0; m < 4; m++) {
            for (int n = 0; n < 6; n++) {
                temp[m] += dataJual[m][n];
            }
            //array temp disimpan dalam max, kemudian max di cek dengan isi 
            //array temp yang lain
            max = temp[0];
            for (int p = 0; p < 4; p++) {
                if (temp[0] > max) {
                    max = temp[p];
                } else {
                    max = max;
                }
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Penjualan terbanyak yaitu " + lakuBanyak);
    }
}