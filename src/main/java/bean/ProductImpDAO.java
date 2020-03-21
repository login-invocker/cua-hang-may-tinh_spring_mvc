package bean;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.jta.TransactionFactory;

import entity.Product;
import modelAPI.I_Products;

@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductImpDAO implements I_Products {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<Product> getAllProduct() {
		Session session = sessionFactory.getCurrentSession();
		List<Product> listProduct=session.createQuery("from d_product").getResultList();
		return listProduct;
	}
	@Override
	public List<Product> getProductLimit(int spBatDau,int spEnd) {
		Session ss= sessionFactory.getCurrentSession();
		List<Product> listProduct=ss.createQuery("from d_product").setFirstResult(spBatDau).setMaxResults(spEnd).getResultList();
		return listProduct;
	}

}
