package bean;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Trademark;
import modelAPI.I_Trademark;
@Transactional
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TrademarkImpDAO implements I_Trademark{
		@Autowired
		SessionFactory sessionfactory;
	
	@Override
	public List<Trademark> getAllTrademrk() {
		Session session = sessionfactory.getCurrentSession();
		List<Trademark> trademarks=session.createQuery("from d_trademark").getResultList();
		return trademarks;
	}

	@Override
	public Trademark getTrademarkById(int Id) {
		Session session = sessionfactory.getCurrentSession();
		Trademark trademark=(Trademark)session.createQuery("from d_trademark where id="+Id).getSingleResult();
		return trademark;
	}

	@Override
	public boolean updateTrademarkById(int id,String name, int id_brand) {
		
		Session session = sessionfactory.getCurrentSession();
		Trademark brand= session.load(Trademark.class, id);
		brand.setName(name);
		brand.setId_trademark(id_brand);
		session.update(brand);
		
		// not update
		return false;
	}

	@Override
	public Trademark deleteTrademarkById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
