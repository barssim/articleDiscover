package model;

public class Article {
	private int artNo;
	private String artName;
	private String artDestination;
	private int artPrice;
	private String artTransportCost;
	
	public String getArtDestination() {
		return artDestination;
	}
	public void setArtDestination(String artDestination) {
		this.artDestination = artDestination;
	}
	public int getArtPrice() {
		return artPrice;
	}
	public void setArtPrice(int artPrice) {
		this.artPrice = artPrice;
	}
	public int getArtNo() {
		return artNo;
	}
	public void setArtNo(int artNo) {
		this.artNo = artNo;
	}
	public String getArtName() {
		return artName;
	}
	public void setArtName(String artName) {
		this.artName = artName;
	}
	public String getArtTransportCost() {
		return artTransportCost;
	}
	public void setArtTransportCost(String artTransportCost) {
		this.artTransportCost = artTransportCost;
	}
	
	

}
