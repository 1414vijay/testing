package Collection1;

public class Bike {
	private String brand;
	private int price;
	private String color;
	private boolean isImported;
	public String getBrand() {
		return brand;
	}
	public void setBike(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isImported() {
		return isImported;
	}
	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	public Bike(String brand, int price, String color, boolean isImported) {
		
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isImported = isImported;
	}

	public String toString() {
		return "brand=" + brand + ", price=" + price + ", color=" + color + ", isImported=" + isImported;
	}
	
	
	
	

}
