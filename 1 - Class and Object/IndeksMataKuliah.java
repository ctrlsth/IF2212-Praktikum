/**
 * IndeksMataKuliah.java
 * [Digunakan untuk memodelkan seorang mahasiswa ITB]
 * @author [18221171] [Hans Stephano Edbert N]
 */

public class IndeksMataKuliah {
    // Deklarasi atribut
    private MataKuliah mataKuliah;
    private String nama;
    private String indeks;
    private Double nilai;

    /**
     * Konstruktor
     * 
     * @param mk
     * @param nama
     * @param nilai
     *                   indeks ditentukan berdasarkan nilai yang diperoleh dengan
     *                   ketentuan sebagai berikut
     *                   A -> nilai = 4
     *                   B -> 3.0 <= nilai < 4.0
     *                   C -> 2.0 <= nilai < 3.0
     *                   D -> 1.0 <= nilai < 2.0
     *                   E -> 0.0 <= nilai < 1.0
     *                   Apabila nilai tidak valid, maka indeks dianggap E dan nilai
     *                   dianggap 0
     */
    public IndeksMataKuliah(MataKuliah mk, String nama, Double nilai) {
		this.mataKuliah = mk;
		this.nama = nama;
		this.nilai = nilai;
    }

    /**
     * Getter mataKuliah
     * 
     * @return mataKuliah
     */
    public MataKuliah getMataKuliah() {
		return this.mataKuliah;
    }

    /**
     * Getter nama
     * 
     * @return nama
     */
    public String getNama() {
		return this.nama;
    }

    /**
     * Getter indeks
     * 
     * @return indeks
     */
    public String getIndeks() {
		return this.indeks;
    };

    /**
     * Getter nilai
     * 
     * @return nilai
     */
    public Double getNilai() {
		return this.nilai;
    }

    /**
     * Mengubah nilai mahasiswa
     * 
     * @param nilai nilai baru dari mahasiswa
     */
    public void ubahNilai(Double nilai) {
		this.nilai = nilai;
    }

    /**
     * Update indeks
     * 
     */
    public void updateIndeks(Double nilai) {
		this.ubahNilai(nilai);
		
		if (this.nilai == 4.0) {
			this.indeks = "A";
		}
		else if (3.0 <= this.nilai && this.nilai < 4.0) {
			this.indeks = "B";
		}
		else if (2.0 <= this.nilai && this.nilai < 3.0) {
			this.indeks = "C";
		}
		else if (1.0 <= this.nilai && this.nilai < 2.0) {
			this.indeks = "D";
		}
		else {
			this.indeks = "E";
			if (this.nilai < 0.0 && this.nilai > 4.0) {
				this.nilai = 0.0;
			}
		}
    }

    /**
     * Normalisasi nilai
     * 
     * @param countLulus jumlah mahasiswa yang lulus
     * Normalisasi nilai dilakukan dengan menambahkan nilai saat ini dengan 
     * persentase jumlah mahasiswa yang lulus
     * 
     * Apabila hasil normalisasi lebih dari 4.0, maka akan dianggap 4
     */
    public void normalisasiNilai(int countLulus) {
		Double normalizedNilai = this.nilai + ((countLulus / this.mataKuliah.getKapasitas()) * this.nilai);
		this.ubahNilai(normalizedNilai);
    }

    /**
     * Menghitung kontribusi ke IP
     * Kontribusi ke IP dihitung dari jumlah sks dikali nilai dibagi total sks
     * 
     * @param sks total sks mahasiswa
     */
    public Double kontribusiIP(int sks) {
		return (this.mataKuliah.getSks() * this.nilai / sks);
    }
}
