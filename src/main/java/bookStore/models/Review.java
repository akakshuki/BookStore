package bookStore.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Review")
@EntityListeners(AuditingEntityListener.class)
public class Review {
	private int Idr;
	private int Idu;
	private int Idb;
	private String ContentReview;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="idr",nullable = false) 
	public int getIdr() {
		return Idr;
	}
	public void setIdr(int idr) {
		Idr = idr;
	}
	@Column(name="idu",nullable = false) 
	public int getIdu() {
		return Idu;
	}
	public void setIdu(int idu) {
		Idu = idu;
	}
	@Column(name="idb",nullable = false) 
	public int getIdb() {
		return Idb;
	}
	public void setIdb(int idb) {
		Idb = idb;
	}
	@Column(name="contentreview",nullable = false) 
	public String getContentReview() {
		return ContentReview;
	}
	public void setContentReview(String contentReview) {
		ContentReview = contentReview;
	}

}
