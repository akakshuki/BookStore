package bookStore.models.views;

import java.sql.Date;

public class BooksView {
	private int Idb;
	private String NameB;
	private String Publisher;
	private Date Publishdate;
	private String Language;
	private int Width;
	private int Height;
	private int Weight;
	private int Pagenumber;
	private String Descriptions;
	private String Imagepath;
	private double Price;
	private int Amount;
	private int Idc;
	private boolean StatusB;
	public int getIdb() {
		return Idb;
	}
	public void setIdb(int idb) {
		Idb = idb;
	}
	public String getNameB() {
		return NameB;
	}
	public void setNameB(String nameB) {
		NameB = nameB;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public Date getPublishdate() {
		return Publishdate;
	}
	public void setPublishdate(Date publishdate) {
		Publishdate = publishdate;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public int getPagenumber() {
		return Pagenumber;
	}
	public void setPagenumber(int pagenumber) {
		Pagenumber = pagenumber;
	}
	public String getDescriptions() {
		return Descriptions;
	}
	public void setDescriptions(String descriptions) {
		Descriptions = descriptions;
	}
	public String getImagepath() {
		return Imagepath;
	}
	public void setImagepath(String imagepath) {
		Imagepath = imagepath;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getIdc() {
		return Idc;
	}
	public void setIdc(int idc) {
		Idc = idc;
	}
	public boolean isStatusB() {
		return StatusB;
	}
	public void setStatusB(boolean statusB) {
		StatusB = statusB;
	}

}
