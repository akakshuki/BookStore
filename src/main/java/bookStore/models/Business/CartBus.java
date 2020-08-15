package bookStore.models.Business;

import java.util.List;
import java.util.stream.Collectors;

import bookStore.models.Cart;
import bookStore.models.repository.ICartRepository;

public class CartBus {
	// Gọi Jpa từ repository để sử dụng
	ICartRepository _cart;

	public CartBus(ICartRepository cart) {
		this._cart = cart;
	}

	public List<Cart> getAllCart(int userId) {
		var carts = _cart.findAll().stream().filter(cart -> cart.getIDU() == userId).collect(Collectors.toList());
		return carts;
	}
}
