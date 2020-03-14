package Controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Categories;
import entity.Trademark;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {

	@Autowired
	SessionFactory sessionfactory;
	
@GetMapping
@Transactional
	public String Default() {
		Session session= sessionfactory.getCurrentSession();
		
		Trademark trademark = new Trademark();
		trademark.setId_trademark(1966);
		trademark.setName("Asus");
		trademark.setPicture("/public/img");
		
		Categories categories = new Categories();
		categories.setId_categories(2000);
		categories.setPicture("/public");
		categories.setName("olaptop");
		
		Categories categories1 = new Categories();
		categories1.setId_categories(2000);
		categories1.setPicture("/public");
		categories1.setName("pc");
		
		Set<Categories> listCategories= new HashSet<>();
		listCategories.add(categories);
		listCategories.add(categories1);
		trademark.setCategories(listCategories);
		session.save(trademark);
		return "null";
	}
}
