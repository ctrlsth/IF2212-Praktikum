/**
 * DaftarMataKuliah.java
 * [Digunakan untuk membentuk suatu mata kuliah berserta rinciannya]
 * @author [18221171] [Hans Stephano Edbert N]
 */

import java.util.Scanner;

public class DaftarMataKuliah {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		String kode = obj.nextLine();
		String nama = obj.nextLine();
		String sks = obj.nextLine();
		String dosen = obj.nextLine();
		int kapasitas = obj.nextInt();
		int tambahan = obj.nextInt();
		int da_sks = Integer.parseInt(sks);
		
		MataKuliah newMatkul = new MataKuliah(kode, nama, da_sks, dosen, kapasitas);
		
		System.out.println("Kode Mata Kuliah: " + kode);
		System.out.println("Nama Mata Kuliah: " + nama);
		System.out.println("SKS Mata Kuliah: " + sks);
		System.out.println("Nama Dosen: " + dosen);
		System.out.println("Kapasitas Kuliah: " + kapasitas);
		newMatkul.tambahKapasitas(tambahan);
		System.out.println("Total Revisi Kapasitas Kuliah: " + newMatkul.getKapasitas());
	}
}
