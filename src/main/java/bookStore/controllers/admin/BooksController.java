package bookStore.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import bookStore.models.repository.IBooksRepository;

//Dành cho các tác vụ liên quan đến quản lý Book trong admin

@Controller
public class BooksController {
	//Gọi hàm từ business để sử dụng
	@Autowired
	IBooksRepository bkrep;
	
}
