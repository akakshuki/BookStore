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
@Table(name = "Category")
@EntityListeners(AuditingEntityListener.class)
public class Category {
	private int Idc;
	private String NameC;
	private boolean StatusC;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="idc",nullable = false) 
	public int getIdc() {
		return Idc;
	}
	public void setIdc(int idc) {
		Idc = idc;
	}
	@Column(name="namec",nullable = false,length = 50) 
	public String getNameC() {
		return NameC;
	}
	public void setNameC(String nameC) {
		NameC = nameC;
	}
	@Column(name="statusc",nullable = false,columnDefinition="bit default 1") 
	public boolean isStatusC() {
		return StatusC;
	}
	public void setStatusC(boolean statusC) {
		StatusC = statusC;
	}

}
