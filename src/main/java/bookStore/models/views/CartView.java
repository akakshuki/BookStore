package bookStore.models.views;



public class CartView {
	private int Idca;
	private int Idu;
	private int Idb;
	private int Quantity;
	private BooksView Book;
	
	public CartView(int idca, int idu, int idb, int quantity, BooksView book) {
		super();
		Idca = idca;
		Idu = idu;
		Idb = idb;
		Quantity = quantity;
		Book = book;
	}
	
	
	public BooksView getBook() {
		return Book;
	}
	public void setBook(BooksView book) {
		Book = book;
	}
	public int getIdca() {
		return Idca;
	}
	public void setIdca(int idca) {
		Idca = idca;
	}
	public int getIdu() {
		return Idu;
	}
	public void setIdu(int idu) {
		Idu = idu;
	}
	public int getIdb() {
		return Idb;
	}
	public void setIdb(int idb) {
		Idb = idb;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

}
