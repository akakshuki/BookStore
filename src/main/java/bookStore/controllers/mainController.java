package bookStore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//trang Test

@Controller
public class mainController {
	//Gọi hàm từ business để sử dụng
	
	@RequestMapping("/main")
	public String main(Model model) {
			return "admin/AdminMainPage";
	}
}
