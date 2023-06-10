package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.SaleDao;
import springmvc.model.Sale;

@Service
public class SaleService {
	
	@Autowired
	private SaleDao saleDao;
	

	public Sale getSaleDao(int pId) {
		return this.saleDao.getSale(pId);
	}

	public void createSale(Sale sale) {

		this.saleDao.saveOrUpdate(sale);
	}

	public List<Sale> readSales() {

		return this.saleDao.getSales();
	}

	public Sale readSale(int productId) {

		return this.saleDao.getSale(productId);
	
	}

	public void RemoveSale(int productId) {

		this.saleDao.deleteSale(productId);
	}
	public void RemoveAll() {
		this.saleDao.deleteAll();
	}
}
