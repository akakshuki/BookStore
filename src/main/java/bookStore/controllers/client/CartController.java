package bookStore.controllers.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import bookStore.models.Business.CartBus;
import bookStore.models.repository.IBooksRepository;
import bookStore.models.repository.ICartRepository;
import bookStore.models.views.CartView;

//Dành cho các tác vụ liên quan đến Cart trong client

@Controller
public class CartController {
	// Gọi hàm từ business để sử dụng
	@Autowired
	ICartRepository _cart;
	@Autowired
	IBooksRepository _bookRepository;

	@RequestMapping("/cart")
	// lay danh sach cart voi id user

	public String GetCart(Model model) {
		List<CartView> list = new CartBus(_cart, _bookRepository).getAllCart(2);
		model.addAttribute("listCartUser", list);
		return "client/Cart";
	}

	// them moi cart
	@RequestMapping("/addNewCart")
	public String AddNewCart(@RequestParam int productId, Model model) {
		// get id user from cookie
		boolean res = new CartBus(_cart, _bookRepository).addNewCart(2, productId);
		model.addAttribute("errorMessage", res ? "Success" : "Error");
		return "";
	}

	// change value quantity by out forcus event
	@RequestMapping(value = "/changeQuanityBookInCart", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<String> ChangeQuanityBookInCart(@RequestParam int productId,
			@RequestParam int quantity) {
		return new ResponseEntity<String>(
				new CartBus(_cart, _bookRepository).changeQuantity(2, productId, quantity) ? "Success" : "Error",
				HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteAElementInCart", method = RequestMethod.GET)
	public @ResponseBody String DeleteAElementInCart(@RequestParam int idCart) {
		return new CartBus(_cart, _bookRepository).deleteCart(idCart) ? "Success" : "Error";
	}

}
