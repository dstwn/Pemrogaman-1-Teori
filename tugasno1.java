
// Nama     : Dwi Setiawan
// NIM      : 18520241011
// Prodi    : Pend. Teknik Informatika

public class tugasno1 {
    public static void main(String[] args){
        // Generate  random nomor dari index char di kode ascii
		int ongko = 65 + (int)(Math.random() * (90 - 65));

		// menampilkan kode ascii huruf random dengan uppercase letter
		System.out.println((char)(ongko));
    }

}