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
@Table(name = "Cart")
@EntityListeners(AuditingEntityListener.class)
public class Cart {
	private int Idca;
	private int Idu;
	private int Idb;
	private int Quantity;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="idca",nullable = false) 
	public int getIDCA() {
		return Idca;
	}
	public void setIDCA(int iDCA) {
		Idca = iDCA;
	}
	@Column(name="idu",nullable = false) 
	public int getIDU() {
		return Idu;
	}
	public void setIDU(int iDU) {
		Idu = iDU;
	}
	@Column(name="idb",nullable = false) 
	public int getIDB() {
		return Idb;
	}
	public void setIDB(int iDB) {
		Idb = iDB;
	}
	@Column(name="quantity",nullable = false) 
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	
	
}
