package Controller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import entity.Categories;
import entity.Trademark;
import services.TrademarkServiceImp;

@RestController
@RequestMapping("/brand")
public class TrademarkAPI {
	@Autowired
	TrademarkServiceImp trademarkService;
	@GetMapping("/{id}")
	@ResponseBody
	public Trademark getAllBrand(@PathVariable int id) {
		
		Trademark trademarks=trademarkService.getTrademarkById(id);	
		Set<Categories> categories = new HashSet<Categories>();
		
		for(Categories c:categories) {
		System.out.println(c.getName());
		}
	return  null;
	}
	@GetMapping
	public List<Trademark> getAllBrand(ModelMap mm){
		List<Trademark> trademarks= new ArrayList<Trademark>(trademarkService.getAllTrademrk());
		for(Trademark t:trademarks) {
			System.out.println(t.getName());
		}
		mm.addAttribute("listbrand",trademarks);
		return trademarks;
	}
}
