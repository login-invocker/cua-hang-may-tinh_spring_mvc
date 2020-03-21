package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.ProductImpDAO;
import entity.Product;
import modelAPI.I_Products;

@Service
public class ProductServices implements I_Products {
	@Autowired
	ProductImpDAO productDao;
	@Override
	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}
	@Override
	public List<Product> getProductLimit(int spBatDau, int spEnd) {
		// TODO Auto-generated method stub
		return productDao.getProductLimit(spBatDau, spEnd);
	}

}
