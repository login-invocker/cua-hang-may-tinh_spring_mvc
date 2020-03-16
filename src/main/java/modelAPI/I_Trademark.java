package modelAPI;

import java.util.List;

import entity.Trademark;

public interface I_Trademark {
	List<Trademark>  getAllTrademrk();
	Trademark getTrademarkById(int id);
	boolean updateTrademarkById(int id,String name,int id_brand);
	Trademark deleteTrademarkById(int id);
}
