/**
 * Sirik.java
 * [Child Class dari Robot: Sirik]
 * @author [18221171] [Hans Stephano E]
 */

public class Sirik extends Robot {

    private long price;
    private int totalModel;

    public Sirik(long price) {
        // Konstruktor, set jumlah model bernilai 1
        super(5, false);
        this.price = price;
        this.totalModel = 1;
    }

    public int getTotalModel(){
        // Mengembalikan jumlah
        return this.totalModel;
    }

    public void addModel(){
        // Menambahkan model sejumlah 1
        this.totalModel += 1;
    }

    @Override
    public long getPrice() {
        // Apabila total model lebih dari 2, 
        // maka formula = price + (500 * numberOfParts - (100 * totalModel))
        // Apabila total model kurang dari/sama dengan 2,
        // maka formula = price + (500 * numberOfParts * totalModel)
        if (getTotalModel() > 2) {
			return (this.price + (500 * getNumberOfParts() - (100 * getTotalModel())));
		} 
		else {
			return (this.price + (500 * getNumberOfParts() * getTotalModel()));
		}
    }
}
