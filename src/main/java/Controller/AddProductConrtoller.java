package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/addproduct")
@Controller
public class AddProductConrtoller {
	@GetMapping
	public String index() {
		return "addproduct";
	}
}
