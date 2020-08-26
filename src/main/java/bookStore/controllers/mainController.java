package bookStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bookStore.models.repository.IUsersRepository;

//trang Test

@Controller
public class mainController {
	// Gọi hàm từ business để sử dụng
	@Autowired
	IUsersRepository user;

	@RequestMapping("/main")
	public String main(Model model) {

		return "admin/AdminMainPage";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {

		return "test";
	}

}
