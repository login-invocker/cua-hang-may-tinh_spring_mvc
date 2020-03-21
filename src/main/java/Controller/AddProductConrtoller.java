package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Product;
import services.ProductServices;
@RequestMapping("/addproduct")
@Controller
public class AddProductConrtoller {
	@Autowired
	ProductServices productService;
	@GetMapping
	public String index(ModelMap mm) {
		
		List<Product> listProduct = productService.getAllProduct();
		mm.addAttribute("totalPage",Math.ceil((double)listProduct.size()/5));
		 mm.addAttribute("listProduct",listProduct );
		return "addproduct";
	}
	@PostMapping
	public String addProduct(){
		
		return "addproduct";
	}
}
