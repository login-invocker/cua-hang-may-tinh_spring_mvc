package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.CategoriesImpDao;
import entity.Categories;
import modelAPI.I_Categories;

@Service
public class CategoriesServiceImp implements I_Categories{
	
	@Autowired
	CategoriesImpDao categoryDao;
	@Override
	public List<Categories> getAllCategories() {
		
		return categoryDao.getAllCategories();
	}

	@Override
	public List<Categories> getCateriesOfBrand() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
