package modelAPI;

import java.util.List;

import entity.Categories;

public interface I_Categories {
		List<Categories> getAllCategories();
		List< Categories> getCateriesOfBrand();
}
