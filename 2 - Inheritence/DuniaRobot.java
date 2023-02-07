/**
 * DuniaRobot.java
 * [Main dari Class of Robots bertujuan untuk menampilkan harga dan
 * spesifikasi dari tiap model robot]
 * @author [18221171] [Hans Stephano E]
 */

import java.util.Scanner;

public class DuniaRobot {
    public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int i;
		int roboType = obj.nextInt();
		
		if (roboType == 1) {
			int numOfParts = obj.nextInt();
			int totalTransform = obj.nextInt();
			boolean active = obj.nextBoolean();
			
			Bumblebee beeBoop = new Bumblebee(numOfParts, active);
			for (i = 0; i < totalTransform; i++) {
				beeBoop.addTransformation();
			}
			
			System.out.println(beeBoop.toString());
			System.out.println("Jumlah transformasi: " + beeBoop.getTotalTransformation());
			System.out.println("Harga robot: " + beeBoop.getPrice());
			
		}
		else if (roboType == 2) {
			long priceTag = obj.nextLong();
			int modelTotal = obj.nextInt();
			
			Sirik Bixby = new Sirik(priceTag);
			for (i = 0; i < modelTotal; i++) {
				Bixby.addModel();
			}
			
			System.out.println(Bixby.toString());
			System.out.println("Jumlah model: " + Bixby.getTotalModel());
			System.out.println("Harga robot: " + Bixby.getPrice());
		}
		else if (roboType == 3) {
			long daMileage = obj.nextLong();
			boolean active = obj.nextBoolean();
			
			WallE tukangSampah = new WallE(daMileage, active);
			
			System.out.println(tukangSampah.toString());
			System.out.println("Jumlah mileage: " + tukangSampah.getMileage());
			System.out.println("Harga robot: " + tukangSampah.getPrice());
		}
    }
}
