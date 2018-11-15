
// Nama     : Dwi Setiawan
// NIM      : 18520241011
// Prodi    : Pend. Teknik Informatika
//import librari scanner
import java.util.*;
public class tugasno2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);	// buat objek Scanner 

		// input r1x dari user, tipe data double
		System.out.print("masukkan r1 x: ");
		double r1x = input.nextDouble();
		// input r1y dari user , tipe data double
		System.out.print("masukkan r1 y: ");
		double r1y = input.nextDouble();
		//input lebar r1 dari user , tipe data double
		System.out.print("masukkan lebar r1 : "); 
		double r1Width = input.nextDouble();
		//input tinggi r1 dari user, tipe data double
		System.out.print("masukkan tinggi r1 : ");
		double r1Height = input.nextDouble();
		
		
		//input r2x dari user, tipe data double
		System.out.print("masukkan r2 x : ");
		double r2x = input.nextDouble();
		//input r2y dari user, tipe data double
		System.out.print("masukkan r2 y : ");
		double r2y = input.nextDouble();
		//input lebar r2 dari user, tipe data double
		System.out.print("masukkan lebar r2' ");
		double r2Width = input.nextDouble();
		//input tinggi r2 dari user, tipe data double
		System.out.print("masukkan tinggi r2 ");
		double r2Height = input.nextDouble();
		
		// menentukan apakah persegi panjang kedua ada di dalam yang pertama, jika iya , maka eksekusi
		if	((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) && 
			(Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2) &&
			(r1Height / 2 + r2Height / 2 <= r1Height) &&
			(r1Width / 2 + r2Width / 2 <= r1Width))
			System.out.println("r2 didalam r1");
		//mengecek apakah r2 memotong r1, jika ya, maka eksekusi
		else if ((r1x + r1Width / 2 > r2x - r2Width) ||
					(r1y + r1Height / 2 > r2y - r2Height))
			System.out.println("r2 memotong r1");

		//jika semua kondisi tidak terpenuhi maka eksekusi
		else
			System.out.println("r2 tidak memotong r1");
    }
}