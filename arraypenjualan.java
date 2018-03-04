import java.io.*;
public class arraypenjualan{
  public static void main (String []argg) throws IOException {
    BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
    int [][]data= new int [4][6];
    int ulang1=0,ulang2=0,palinglaku=0,totalseluruh=0;
    String baranglaku="";
    int []totalhari=new int [6];
    String []barang ={"Pencil 2B","Buku Tulis","Penggaris","Penghapus"};
	String []namahari ={"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu"};
     //input data
	try {
      for (ulang1=0;ulang1<data.length;ulang1++){
		  System.out.println("=====================DATA PENJUALAN=========================");
        for (ulang2=0;ulang2<data[ulang1].length;ulang2++){
          System.out.print("jumlah penjualan "+barang[ulang1]+" hari "+namahari[ulang2]+": ");
          data[ulang1][ulang2]=Integer.parseInt(br.readLine ());
        }
      }
    } 
    catch (Exception e) {
      System.out.println ("DATA YANG DIMASUKKAN HARUS BERUPA ANGKA !");
    }
    System.out.println ("\t ======================================= \t");
    System.out.println ("\t\t Data Penjualan 1 Minggu\t\t");
    System.out.println ("\t ======================================= \t\n");
    //print out nama hari
    System.out.print ("Nama Hari \t");
    for (ulang1=0;ulang1<namahari.length;ulang1++){
      System.out.print (namahari[ulang1]+"\t");
    }
    System.out.print ("Total \t");
    System.out.println ();
    //print out data
    for (ulang1=0;ulang1<data.length;ulang1++){
      int total=0;
      System.out.print (barang[ulang1]+"\t");
      for (ulang2=0;ulang2<data[ulang1].length;ulang2++){
        System.out.print (data[ulang1][ulang2]+"\t");
        total=total+data[ulang1][ulang2];
        totalhari[ulang2] += data[ulang1][ulang2];
        if (total > palinglaku) {
          palinglaku = total;
          baranglaku = barang[ulang1];
        }
      }
      totalseluruh += total;
      System.out.print (total+"\t");
      System.out.println ();
    }  
    //print out total
    System.out.print ("Total \t\t");
    for (ulang1=0;ulang1<totalhari.length;ulang1++){
      System.out.print (totalhari[ulang1]+"\t");
    }
    System.out.print (totalseluruh+"\t");
    System.out.println ();
    System.out.println ("-----------------------------------------------------------------------\n");
    System.out.println ("Barang yang banyak terjual adalah : "+baranglaku);
  }
}