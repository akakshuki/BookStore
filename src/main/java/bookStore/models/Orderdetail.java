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
@Table(name = "Orderdetail")
@EntityListeners(AuditingEntityListener.class)
public class Orderdetail {
	private int Idod;
	private int Idb;
	private int Quantity;
	private int Ido;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="idod",nullable = false) 
	public int getIdod() {
		return Idod;
	}
	public void setIdod(int idod) {
		Idod = idod;
	}
	@Column(name="idb",nullable = false) 
	public int getIdb() {
		return Idb;
	}
	public void setIdb(int idb) {
		Idb = idb;
	}
	@Column(name="quantity",nullable = false) 
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Column(name="ido",nullable = false) 
	public int getIdo() {
		return Ido;
	}
	public void setIdo(int ido) {
		Ido = ido;
	}

}
