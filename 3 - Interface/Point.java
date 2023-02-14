// NIM		: 18221171
// Nama		: Hans Stephano E
// Tanggal	: 14 Februari 2023
// Topik	: Interface
// Deskripsi: Point Class

public class Point {
	
	private int x;
	private int y;
	
	public Point(int a, int b) {
		x = a; y = b;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
