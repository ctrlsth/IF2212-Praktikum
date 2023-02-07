/**
 * Robot.java
 * [Implementasi Model dari Robot Modern sebagai Parent Class]
 * @author [18221171] [Hans Stephano E]
 */

public abstract class Robot {

    private int numberOfParts;
    private boolean isActive;

    public Robot(int numberOfParts, boolean isActive) {
        this.numberOfParts = numberOfParts;
        this.isActive = isActive;
    }

    public int getNumberOfParts() {
        // Mengembalikan atribut numberOfParts
        return this.numberOfParts;
    }

    public boolean getIsActive() {
        // Mengembalikan atribut isActive
        return this.isActive;
    }

    public void setActivation(boolean isActive) {
        // Menetapkan atribut isActive
        this.isActive = isActive;
    }

    public String toString() {
        // Mengembalikan informasi hewan dengan format: 
        // "Number of Parts: {numberOfParts}, IsActive: {isActive}"
		String converted = "Number of Parts: " + getNumberOfParts() + ", IsActive: " + getIsActive();
		return converted;
    }

    public abstract long getPrice();
}
