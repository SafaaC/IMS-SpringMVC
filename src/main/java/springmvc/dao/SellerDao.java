package springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Purchase;
import springmvc.model.Sale;
import springmvc.model.Seller;
@Repository
public class SellerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Create
	@Transactional
	public void saveOrUpdate(Seller seller) {
		this.hibernateTemplate.saveOrUpdate(seller);

	}

	// Read All
	public List<Seller> getSellers() {
		List<Seller> sellers = this.hibernateTemplate.loadAll(Seller.class);
		return sellers;
	}

	// Read Single
	@Transactional
	public Seller getSeller(int sellerId) {
		Seller seller = this.hibernateTemplate.get(Seller.class, sellerId);
		return seller;
	}

	// Delete
	@Transactional
	public void deleteSeller(int sellerId) {
		Seller s = this.hibernateTemplate.load(Seller.class, sellerId);
		this.hibernateTemplate.delete(s);
	}

	// read by product name
	@Transactional
	public Seller getByName(String sellerName) {
		List<Seller> sellers = this.hibernateTemplate.loadAll(Seller.class);
		for (Seller seller : sellers) {
			if ((seller.getSellerName()).equalsIgnoreCase(sellerName)) {
				return seller;
			}
		}
		return null;
	}
	@Transactional
	public Seller getbySName(String sellerId) {
		List<Seller> sellers=this.hibernateTemplate.loadAll(Seller.class);
		for(Seller seller:sellers) {
			String s=Integer.toString(seller.getSellerId());
			if(s.equals(sellerId)) {
				return seller;
			}	
		}
		return null;
	}
}
