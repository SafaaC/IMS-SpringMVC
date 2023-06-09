package springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Purchase;

@Repository
public class PurchaseDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//Create
	@Transactional
	public void saveOrUpdate(Purchase purchase) {
		this.hibernateTemplate.saveOrUpdate(purchase);
		
	}
	//Read All
	public List<Purchase> getPurchases() {
		List<Purchase> purchases=this.hibernateTemplate.loadAll(Purchase.class);
		return purchases;
	}
	//Read Single 
	@Transactional
	public Purchase getPurchase(int productId) {
		Purchase p= this.hibernateTemplate.get(Purchase.class,productId);
		return p;
	}
	
	//Delete
	@Transactional
	public void deletePurchase(int productId) {
		Purchase p= this.hibernateTemplate.load(Purchase.class,productId);
		this.hibernateTemplate.delete(p);
	}
	
	
	
}
