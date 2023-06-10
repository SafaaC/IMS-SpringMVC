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
	
	//get product name from id
	@Transactional
	public String getNameById(int productId) {
		List<Purchase> purchases=this.hibernateTemplate.loadAll(Purchase.class);
		for(Purchase purchase:purchases) {
			if(purchase.getProductId()==productId) {
				return purchase.getProductName();
			}	
		}
		return null;
	}
	
	//read by product name
	@Transactional
	public Purchase getByName(String productName) {
		List<Purchase> purchases=this.hibernateTemplate.loadAll(Purchase.class);
		for(Purchase purchase:purchases) {
			if(purchase.getProductName().equals(productName)) {
				return purchase;
			}	
		}
		return null;
	}
	//get product selling rate from id
	@Transactional
	public double getPriceById(int productId) {
		List<Purchase> purchases=this.hibernateTemplate.loadAll(Purchase.class);
		for(Purchase purchase:purchases) {
			if(purchase.getProductId()==productId) {
				return purchase.getSellingRate();
			}	
		}
		return 0;
	}
	
	@Transactional
	public Purchase getbySName(String productId) {
		List<Purchase> purchases=this.hibernateTemplate.loadAll(Purchase.class);
		for(Purchase purchase:purchases) {
			String s=Integer.toString(purchase.getProductId());
			if(s.equals(productId)) {
				return purchase;
			}	
		}
		return null;
	}
	
}
