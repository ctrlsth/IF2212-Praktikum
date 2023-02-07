/**
 * Bumblebee.java
 * [Child Class dari Robot: Bumblebee]
 * @author [18221171] [Hans Stephano E.]
 */

public class Bumblebee extends Robot {

    private int totalTransformation;

    public Bumblebee(int numberOfParts, boolean isActive) {
        // Konstruktor, set totalTransformation = 1
        super(numberOfParts, isActive);
        this.totalTransformation = 1;
    }

    public int getTotalTransformation(){
        // Mengembalikan totalTransformation
        return this.totalTransformation;
    }

    public void addTransformation(){
        // Menambahkan totalTransformation sejumlah 1
        this.totalTransformation += 1;
    }

    @Override
    public long getPrice() {
        // Apabila aktif, harga bernilai numberOfParts * 1000 * totalTransformation
        // Apabila tidak aktif, harga bernilai numberOfParts * 1000
        if (getIsActive()) {
			return (getNumberOfParts() * 1000 * getTotalTransformation());
		}
		else {
			return (getNumberOfParts() * 1000);
		}
    }
}
