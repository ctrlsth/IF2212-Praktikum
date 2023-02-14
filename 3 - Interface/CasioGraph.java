// NIM		: 18221171
// Nama		: Hans Stephano E
// Tanggal	: 14 Februari 2023
// Topik	: Interface
// Deskripsi: Implementasi dari Interface GraphCalculator

public class CasioGraph implements GraphCalculator {
	
	public Point point;
	public int batteryLevel;
	public boolean status;
	
	public CasioGraph(int x, int y) {
		this.point = new Point(x, y);
		this.batteryLevel = 100;
		this.status = false;
	}
	
	public int add(int a, int b) {
		if (this.status) {
			this.batteryLevel -= 10;
			if (this.batteryLevel <= 0) {
				this.batteryLevel = 0;
				this.status = false;
			}
			return (a + b);
		}
		
		return -1;
	}
	
	public int substract(int a, int b) {
		if (this.status) {
			this.batteryLevel -= 10;
			if (this.batteryLevel <= 0) {
				this.batteryLevel = 0;
				this.status = false;
			}
			return (a - b);
		}
		
		return -1;
	}
	
	public int multiply(int a, int b) {
		if (this.status) {
			this.batteryLevel -= 10;
			if (this.batteryLevel <= 0) {
				this.batteryLevel = 0;
				this.status = false;
			}
			return (a * b);
		}
		
		return -1;
	}
	
	public double divide(int a, int b) {
		if (this.status) {
			this.batteryLevel -= 10;
			if (this.batteryLevel <= 0) {
				this.batteryLevel = 0;
				this.status = false;
			}
			return ((double) a / (double) b);
		}
		
		return -1;
	}
	
	public void start() {
		if (this.batteryLevel > 0) {
			this.status = true;
		}
	}
	
	public void stop() {
		this.status = false;
	}
	
	public int checkBattery() {
		if (this.batteryLevel < 0) {
			this.batteryLevel = 0;
		}
		return this.batteryLevel;
	}
	
	public void shiftX(int shiftCount) {
		if (this.status) {
			int temp = this.point.getX() + shiftCount;
			this.point.setX(temp);
			this.batteryLevel -= 10;
			if (this.batteryLevel <= 0) {
				this.batteryLevel = 0;
				this.status = false;
			}
		}
	}
	
	public void shiftY(int shiftCount) {
		if (this.status) {
			int temp = this.point.getY() + shiftCount;
			this.point.setY(temp);
			this.batteryLevel -= 10;
			if (this.batteryLevel <= 0) {
				this.batteryLevel = 0;
				this.status = false;
			}
		}
	}
	
	public double distance(int x, int y) {
		if (this.status) {
			double disX = Math.pow((this.point.getX() - x), 2);
			double disY = Math.pow((this.point.getY() - y), 2);
			this.batteryLevel -= 10;
			if (this.batteryLevel <= 0) {
				this.batteryLevel = 0;
				this.status = false;
			}
			return (Math.sqrt(disX + disY));
		}
		return -1.0;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public Point getPoint() {
		return this.point;
	}
	
	public void charge() {
		this.batteryLevel = 100;
	}
}
