package bean;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Categories;
import modelAPI.I_Categories;

@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CategoriesImpDao implements I_Categories{

	@Autowired
	SessionFactory sessionfactory;
	@Override
	public List<Categories> getAllCategories() {
		Session session =  sessionfactory.getCurrentSession();
		return  session.createQuery("from d_categories").getResultList();
	}

	@Override
	public List<Categories> getCateriesOfBrand() {
		
		return null;
	}
		
}
