package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.SellerDao;
import springmvc.model.Purchase;
import springmvc.model.Seller;
@Service
public class SellerService {
	@Autowired
	private SellerDao sellerDao;
	

	public Seller getSeller(int pId) {
		return this.sellerDao.getSeller(pId);
	}

	public void createSeller(Seller seller) {

		this.sellerDao.saveOrUpdate(seller);
	}

	public List<Seller> readSellers() {

		return this.sellerDao.getSellers();
	}

	public Seller readSeller(int sellerId) {

		return this.sellerDao.getSeller(sellerId);
	
	}

	public void RemoveSeller(int sellerId) {

		this.sellerDao.deleteSeller(sellerId);
	}
	public Seller getByName(String sellerName) {
		return this.sellerDao.getByName(sellerName);
	}
}
