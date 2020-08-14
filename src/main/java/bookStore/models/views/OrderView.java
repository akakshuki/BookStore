package bookStore.models.views;

import java.sql.Date;

import bookStore.models.StatusOrder;

public class OrderView {
	private int Ido;
	private int Idu;
	private Date DatecreateO;
	private double Total;
	private StatusOrder StatusO;
	public int getIdo() {
		return Ido;
	}
	public void setIdo(int ido) {
		Ido = ido;
	}
	public int getIdu() {
		return Idu;
	}
	public void setIdu(int idu) {
		Idu = idu;
	}
	public Date getDatecreateO() {
		return DatecreateO;
	}
	public void setDatecreateO(Date datecreateO) {
		DatecreateO = datecreateO;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public StatusOrder getStatusO() {
		return StatusO;
	}
	public void setStatusO(StatusOrder statusO) {
		StatusO = statusO;
	}

}
