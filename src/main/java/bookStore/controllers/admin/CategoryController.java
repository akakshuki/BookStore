package bookStore.controllers.admin;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import bookStore.models.Category;
import bookStore.models.repository.ICategoryRepository;

@Controller
public class CategoryController {
	
		@Autowired
		ICategoryRepository caterep;
		
		@RequestMapping("/categorymanagement")
		public String CateMgr(Model model,Category ct) {
			List<Category> ls = caterep.findAll();
			model.addAttribute("cates", ls);
			return "admin/category/catemgr";
		}

		 
		 @RequestMapping(value = "/catecreate", method = RequestMethod.GET)
		 public String addCate(@ModelAttribute("cate1") Category ct, Model model) throws Exception{
		  model.addAttribute("nameC",ct.getNameC());
		  model.addAttribute("status",ct.isStatusC());
		  return "admin/category/cate_frm";
		 }
		@RequestMapping(value="/cates_del",method = RequestMethod.GET)
		public String CateDelete(@RequestParam int id) {
			caterep.deleteById(id);
			return "redirect:categorymanagement";
		}
//		@RequestMapping(value="/cates_create", method = RequestMethod.GET)
//		public String CateInput() {
//			return "category/cate_frm";
//		}
		@RequestMapping(value="/catein", method = 	RequestMethod.POST)
		public String CateAdd(Category cate) {
			caterep.save(cate);
			return "redirect:categorymanagement";
		}
		@RequestMapping(value = "/cateup", method = RequestMethod.GET)
		public String CateFrmUpdate(@RequestParam int id, Model model) {
			Category ct = caterep.findById(id).get();
			model.addAttribute("cate_item", ct);
			model.addAttribute("nameC",ct.getNameC());
			model.addAttribute("status",ct.isStatusC());
			return "admin/category/cate_frm_update";
		}
		@RequestMapping(value = "/cates_change", method = RequestMethod.POST)
			public String CateChange(Category cates) {
			caterep.save(cates);
				return "redirect:/categorymanagement";
			}
		
	

}
