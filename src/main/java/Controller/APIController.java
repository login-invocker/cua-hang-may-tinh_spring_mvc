package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bean.ProductImpDAO;
import entity.Product;
import services.ProductServices;

@Controller
@RequestMapping("api/")
public class APIController {
	@Autowired
	ProductServices productService;
	@GetMapping(path="getproductlimit",produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String getProductLimit(@RequestParam int fistProduct) {
		String htm="";
		List<Product> listProduct= productService.getProductLimit(fistProduct, 5);
		for (Product product : listProduct) {
			htm+="<tr>";
			htm+="<td><div class='checkbox'><label><input type='checkbox'value=''></label></div></td>";
			htm+="<td class='tenSP' data-masp='"+product.getId_product()+"'>"+product.getName()+"</td>";
			htm+="<td class='giatien' data-value='"+product.getPrice()+"'>"+product.getPrice()+"</td>";
			htm+="</tr>";
		}
		
		return htm;
	}
}
