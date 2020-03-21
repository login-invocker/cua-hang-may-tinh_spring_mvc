package modelAPI;
import java.util.List;

import entity.Product;
public interface I_Products {
	List<Product> getAllProduct();
	List<Product> getProductLimit(int spBatDau,int spEnd);
}
