package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.cj.xdevapi.SessionFactory;

import entity.Categories;
import entity.Trademark;
import services.CategoriesServiceImp;
import services.TrademarkServiceImp;

@Controller
@RequestMapping("/")
public class TrangChuController {
	@Autowired
	TrademarkServiceImp trademarkService;
	@Autowired 
	CategoriesServiceImp categoryService;
		@GetMapping
		
		public String trangChu(ModelMap mm) {
			//get all categories
			List<Categories> categories = new ArrayList<Categories>(categoryService.getAllCategories());
			// get all brand
			List<Trademark> trademarks= new ArrayList<Trademark>(trademarkService.getAllTrademrk());
			for(Trademark t:trademarks) {
				System.out.println(t.getName());
			}
			mm.addAttribute("listbrand",trademarks);
			mm.addAttribute("categories",categories);
			return "index";
		}
}