package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.Trademark;
import services.TrademarkServiceImp;

@Controller
@RequestMapping("/dashboard")
public class Dashboard {
	@Autowired
	TrademarkServiceImp trademarkService;
	 	@GetMapping
		public String index(ModelMap mm) {
	 		List<Trademark> listTrademark= trademarkService.getAllTrademrk();
	 	mm.addAttribute("listbrand",listTrademark);
			return "dashboard";
		}
	 	@PutMapping
	 	public boolean update(@RequestParam int id,@RequestParam String name,@RequestParam int id_brand) {
	 		
	 		if(trademarkService.updateTrademarkById(id, name, id_brand)) {
	 			return true;
	 		}
	 		
	 		return false ;
	 	}
}
