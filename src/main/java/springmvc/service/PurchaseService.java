package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.PurchaseDao;
import springmvc.model.Purchase;

@Service
public class PurchaseService {
	@Autowired
	private PurchaseDao purchaseDao;

	public void createPurchase(Purchase purchase) {

		this.purchaseDao.saveOrUpdate(purchase);
	}

	public List<Purchase> readPurchases() {

		return this.purchaseDao.getPurchases();
	}

	public Purchase readPurchase(int productId) {

		Purchase purchase = this.purchaseDao.getPurchase(productId);
		return purchase;
	}

	public void RemovePurchase(int productId) {

		this.purchaseDao.deletePurchase(productId);
	}

	public boolean searchPurchase(int productId) {
		return this.purchaseDao.searchPurchase(productId);
	}

	public String getNameById(int productId) {

		return this.purchaseDao.getNameById(productId);
	}

	public double getPriceById(int productId) {

		return this.purchaseDao.getPriceById(productId);
	}
}
