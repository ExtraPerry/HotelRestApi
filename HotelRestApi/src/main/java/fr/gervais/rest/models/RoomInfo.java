package fr.gervais.rest.models;

public class RoomInfo {
	
	//Attributes - Price, Size.
	private int Price;
	private int Size;
	
	/**
	 * Constructor - Builds a RoomInfo Object.
	 * @param price [int] - The price per day of the room type.
	 * @param size [int] - The size of the room type.
	 */
	public RoomInfo(int price, int size) {
		this.setPrice(price);
		this.setSize(size);
	}

	//Get'er and Set'er Methods.
	
	public int getPrice() {
		return Price;
	}


	private void setPrice(int price) {
		Price = price;
	}


	public int getSize() {
		return Size;
	}


	private void setSize(int size) {
		Size = size;
	}
	
	//Custom Method.
	
}
