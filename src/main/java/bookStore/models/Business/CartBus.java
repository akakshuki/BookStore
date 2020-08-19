package bookStore.models.Business;

import java.util.List;
import java.util.stream.Collectors;

import bookStore.models.Cart;
import bookStore.models.repository.IBooksRepository;
import bookStore.models.repository.ICartRepository;
import bookStore.models.views.BooksView;
import bookStore.models.views.CartView;

public class CartBus {
	// Gọi Jpa từ repository để sử dụng
	ICartRepository _cart;
	IBooksRepository _bookRepository;

	public CartBus(ICartRepository cart, IBooksRepository bookRepository) {
		this._cart = cart;
		this._bookRepository = bookRepository;
	}

	public List<CartView> getAllCart(int userId) {
		// using constructor to creat new bookView to map() make new list
		var carts = _cart.findAll().stream().filter(cart -> cart.getIDU() == userId).map(cart -> new CartView(
				cart.getIDCA(), cart.getIDU(), cart.getIDB(), cart.getQuantity(),
				// get book info per item cart
				_bookRepository.findById(cart.getIDB()).stream()
						.map(book -> new BooksView(book.getIdb(), book.getNameB(), book.getPublisher(),
								book.getPublishdate(), book.getLanguage(), book.getWidth(), book.getHeight(),
								book.getWeight(), book.getPagenumber(), book.getDescriptions(), book.getImagepath(),
								book.getPrice(), book.getAmount(), book.getIdc(), book.isStatusB()))
						.collect(Collectors.toList()).get(0)))
				.collect(Collectors.toList());
		return carts;
	}

	public boolean addNewCart(int userId, int productId) {
		try {
			List<Cart> listCartUser = _cart.findAll().stream().filter(x -> x.getIDU() == userId)
					.collect(Collectors.toList());
			for (Cart cart : listCartUser) {
				if (cart.getIDB() == productId) {
					cart.setQuantity(cart.getQuantity() + 1);
					_cart.save(cart);
				} else {
					var newCart = new Cart();
					newCart.setIDB(productId);
					newCart.setIDU(userId);
					newCart.setQuantity(1);
					_cart.save(newCart);
				}
			}
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			return false;
		}
	}

	public boolean changeQuantity(int userId, int bookId, int quantity) {
		try {
			var cart = _cart.findAll().stream().filter(x -> x.getIDU() == userId && x.getIDB() == bookId)
					.collect(Collectors.toList()).get(0);
			if(cart == null) return false;
			if (quantity == 0)
				_cart.delete(cart);
			else {
				cart.setQuantity(quantity);
				_cart.save(cart);
			}
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean deleteCart(int idCart) {
		try {
			Cart cart = _cart.findById(idCart).get();
			if (cart != null)
				_cart.delete(cart);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
