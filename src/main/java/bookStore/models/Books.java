package bookStore.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "Books")
@EntityListeners(AuditingEntityListener.class)
public class Books {
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


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idb", nullable = false)
	public int getIdb() {
		return Idb;
	}

	public void setIdb(int idb) {
		Idb = idb;
	}

	@Column(name = "nameb", nullable = false, length = 100)
	public String getNameB() {
		return NameB;
	}

	public void setNameB(String nameB) {
		NameB = nameB;
	}

	@Column(name = "publisher", nullable = false, length = 100)
	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	@Column(name = "publishdate", nullable = false)
	public Date getPublishdate() {
		return Publishdate;
	}

	public void setPublishdate(Date publishdate) {
		Publishdate = publishdate;
	}

	@Column(name = "language", nullable = false, length = 100)
	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	@Column(name = "width", nullable = false)
	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	@Column(name = "height", nullable = false)
	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	@Column(name = "weight", nullable = false)
	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	@Column(name = "pagenumber", nullable = false)
	public int getPagenumber() {
		return Pagenumber;
	}

	public void setPagenumber(int pagenumber) {
		Pagenumber = pagenumber;
	}

	@Column(name = "descriptions", nullable = false)
	public String getDescriptions() {
		return Descriptions;
	}

	public void setDescriptions(String descriptions) {
		Descriptions = descriptions;
	}

	@Column(name = "imagepath", nullable = false)
	public String getImagepath() {
		return Imagepath;
	}

	public void setImagepath(String imagepath) {
		Imagepath = imagepath;
	}

	@Column(name = "price", nullable = false)
	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
	
	@Column(name = "amount", nullable = false)
	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	@Column(name = "idc", nullable = false)
	public int getIdc() {
		return Idc;
	}

	public void setIdc(int idc) {
		Idc = idc;
	}

	@Column(name = "statusb", nullable = false)
	public boolean isStatusB() {
		return StatusB;
	}

	public void setStatusB(boolean statusB) {
		StatusB = statusB;
	}

}
