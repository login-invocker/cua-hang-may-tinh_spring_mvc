package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.TrademarkImpDAO;
import entity.Trademark;
import modelAPI.I_Trademark;

@Service
public class TrademarkServiceImp implements I_Trademark{
	@Autowired
	TrademarkImpDAO trademarkdao;
	@Autowired
	SessionFactory sessionfactory;
	@Override
	public List<Trademark> getAllTrademrk() {
		return trademarkdao.getAllTrademrk();
	}
	@Override
	public Trademark getTrademarkById(int Id) {
		return trademarkdao.getTrademarkById(Id);
	}
	//update
	@Override
	public boolean updateTrademarkById(int id, String name, int id_brand) {
		Session session = sessionfactory.getCurrentSession();
		Trademark brand= session.load(Trademark.class, id);
		if(!name.isEmpty()) {
			brand.setName(name);
			if(id_brand>=0) {
				brand.setId_trademark(id_brand);
				trademarkdao.updateTrademarkById(id, name, id_brand);
				return true;
		}
		trademarkdao.updateTrademarkById(id, name, brand.getId());
		return true;
		}else if (id_brand>=0) {
			trademarkdao.updateTrademarkById(id, brand.getName(), id_brand);
			return true;
		}
		
		return false;
	}
	@Override
	public Trademark deleteTrademarkById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
