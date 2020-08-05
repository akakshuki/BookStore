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
@Table(name = "Orders")
@EntityListeners(AuditingEntityListener.class)
public class Order {
	private int Ido;
	private int Idu;
	private Date DatecreateO;
	private double Total;
	private StatusOrder StatusO;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="ido",nullable = false) 
	public int getIdo() {
		return Ido;
	}
	public void setIdo(int ido) {
		Ido = ido;
	}
	@Column(name="idu",nullable = false) 
	public int getIdu() {
		return Idu;
	}
	public void setIdu(int idu) {
		Idu = idu;
	}
	@Column(name="datecreateo",nullable = false,columnDefinition="date default CURRENT_TIMESTAMP") 
	public Date getDatecreateO() {
		return DatecreateO;
	}
	public void setDatecreateO(Date datecreateO) {
		DatecreateO = datecreateO;
	}
	@Column(name="total",nullable = false) 
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	@Column(name="statuso",nullable = false,columnDefinition = "nvarchar(50) default 'Pending'") 
	public StatusOrder getStatusO() {
		return StatusO;
	}
	public void setStatusO(StatusOrder statusO) {
		StatusO = statusO;
	}

	
}
