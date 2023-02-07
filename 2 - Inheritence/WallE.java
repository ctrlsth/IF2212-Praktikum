/**
 * WallE.java
 * [Child Class dari Robot: WallE]
 * @author [18221171] [Hans Stephano E]
 */

public class WallE extends Robot {

    private long mileage;

    public WallE(long mileage, boolean isActive) {
        // Konstruktor
        super(10, isActive);
        this.mileage = mileage;
    }

    public long getMileage(){
        // Mengembalikan mileage
        return this.mileage;
    }

    public void addMileage(long increment){
        // Menambahkan mileage dengan increment
        this.mileage += 1;
    }

    @Override
    public long getPrice() {
        // Apabila sedang aktif, maka harga total adalah mileage * 1000, 
        // Apabila tidak aktif maka ada tambahan biaya 500
        if (getIsActive()) {
			return (1000 * getMileage());
		}
		else
		{
			return ((1000 * getMileage()) + 500);
		}
    }
}
