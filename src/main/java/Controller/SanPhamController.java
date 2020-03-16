package Controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Categories;
import entity.Sub_Categories;
import entity.Trademark;

@Controller
@RequestMapping("/sanpham")
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SanPhamController {
	@Autowired
	SessionFactory sessionfactory;
@GetMapping
@Transactional
	public String Default() {
		Session session= sessionfactory.getCurrentSession();
		// check update
		Trademark trademak = session.load(Trademark.class,7);
		trademak.setName(null);
		trademak.setId_trademark(1);
		session.update(trademak);
		/*
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
		session.save(trademark);*/
		/*Sub_Categories sub = new Sub_Categories();
		sub.setId_sub_categories(2);
		sub.setName("Laptop gaming");
		Sub_Categories sub1 = new Sub_Categories();
		sub1.setId_sub_categories(2);
		sub1.setName("Laptop Đồ Họa");
		Sub_Categories sub2 = new Sub_Categories();
		sub2.setId_sub_categories(2);
		sub2.setName("Laptop Lập trình");
		Sub_Categories sub3 = new Sub_Categories();
		sub3.setId_sub_categories(2);
		sub3.setName("Laptop văn phòng");
		Sub_Categories sub4 = new Sub_Categories();
		sub4.setId_sub_categories(2);
		sub4.setName("Laptop thời trang");
		Set<Sub_Categories > subs = new HashSet<Sub_Categories>();
		subs.add(sub);
		subs.add(sub1);
		subs.add(sub2);subs.add(sub3);subs.add(sub4);
		Categories categories= new Categories();
		categories.setId(999);
		categories.setName("Laptop theo nhu cầu");
		categories.setPicture("/url");
		categories.setSub_categories(subs);
		session.save(categories);*/
		return "null";
	}
}
