package bookStore.controllers.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bookStore.models.repository.ICartRepository;

//Dành cho các tác vụ liên quan đến Cart trong client

@Controller
public class CartController {
	//Gọi hàm từ business để sử dụng
	@Autowired
	ICartRepository _repository;
	
	@RequestMapping("/cart")
	public String GetCart(){
		
		
		return "client/Cart";
	}
	
	
}	
