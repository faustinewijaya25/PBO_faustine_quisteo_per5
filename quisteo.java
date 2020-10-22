import java.util.Scanner;
 
 public class quisteo {
 	public static void main (String [] args) {
 		Scanner masukan = new Scanner(System.in);
 		String nama;
 		int kembalian, bayar, tothar;
 		int jumlah, biaya, pilihan;
 		
 		System.out.print("Masukkan nama anda = ");
 		nama= masukan.nextLine();
 		
 		System.out.println("Tipe Rumah dan Biaya Beban");
 		System.out.println("31. Rp.100.000");
 		System.out.println("32. Rp.125.000");
 		System.out.println("33. Rp.450.000");
 		System.out.println("34. Rp.480.000");
 		System.out.println("35. Rp.500.000");
 		System.out.println("40. Rp.550.000");
 		System.out.print("Pilihan:");
 		pilihan = masukan.nextInt();
 	
 		
 		if (pilihan == 31) {
 			biaya=100000;
 			System.out.println("Biaya Beban = Rp. 100.000");
 			System.out.print("Masukan Jumlah Meteran Pemakaian = ");
 			jumlah = masukan.nextInt();
 			tothar = jumlah * biaya;
 			System.out.println("Total Harga = "+tothar);
 			System.out.print("Masukan Bayaran = ");
 			bayar = masukan.nextInt();
 			kembalian = bayar-tothar;
 			System.out.println("Kembalian anda = "+kembalian);
 		}
 		else
 			if (pilihan == 32) {
 			biaya=125000;
 			System.out.println("Biaya Beban = Rp. 125.000");
 			System.out.print("Masukan Jumlah Meteran Pemakaian = ");
 			jumlah = masukan.nextInt();
 			tothar = jumlah * biaya;
 			System.out.println("Total Harga = "+tothar);
 			System.out.print("Masukan Bayaran = ");
 			bayar = masukan.nextInt();
 			kembalian = bayar-tothar;
 			System.out.println("Kembalian anda = "+kembalian);
 		}
 		else
 			if (pilihan == 33) {
 			biaya=450000;
 			System.out.println("Biaya Beban = Rp. 450.000");
 			System.out.print("Masukan Jumlah Meteran Pemakaian = ");
 			jumlah = masukan.nextInt();
 			tothar = jumlah * biaya;
 			System.out.println("Total Harga = "+tothar);
 			System.out.print("Masukan Bayaran = ");
 			bayar = masukan.nextInt();
 			kembalian = bayar-tothar;
 			System.out.println("Kembalian anda = "+kembalian);	
 		}
 		else
 			if (pilihan == 34) {
 			biaya=480000;
 			System.out.println("Biaya Beban = Rp. 480.000");
 			System.out.print("Masukan Jumlah Meteran Pemakaian = ");
 			jumlah = masukan.nextInt();
 			tothar = jumlah * biaya;
 			System.out.println("Total Harga = "+tothar);
 			System.out.print("Masukan Bayaran = ");
 			bayar = masukan.nextInt();
 			kembalian = bayar-tothar;
 			System.out.println("Kembalian anda = "+kembalian);
 		}
 		else
 			if (pilihan == 35) {
 			biaya=500000;
 			System.out.println("Biaya Beban = Rp. 500.000");
 			System.out.print("Masukan Jumlah Meteran Pemakaian = ");
 			jumlah = masukan.nextInt();
 			tothar = jumlah * biaya;
 			System.out.println("Total Harga = "+tothar);
 			System.out.print("Masukan Bayaran = ");
 			bayar = masukan.nextInt();
 			kembalian = bayar-tothar;
 			System.out.println("Kembalian anda = "+kembalian);
 		}
 		else
 			if (pilihan == 40) {
 			biaya=550000;
 			System.out.println("Biaya Beban = Rp. 550.000");
 			System.out.print("Masukan Jumlah Meteran Pemakaian = ");
 			jumlah = masukan.nextInt();
 			tothar = jumlah * biaya;
 			System.out.println("Total Harga = "+tothar);
 			System.out.print("Masukan Bayaran = ");
 			bayar = masukan.nextInt();
 			kembalian = bayar-tothar;
 			System.out.println("Kembalian anda = "+kembalian);
 		}
 		else {
 			System.out.println("Pilihan anda salah, Silahkan masukan pilihan yang benar");
 		}
	}
 }	

 		
 	