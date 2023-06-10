package springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Sale;

@Repository
public class SaleDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Create
	@Transactional
	public void saveOrUpdate(Sale sale) {
		this.hibernateTemplate.saveOrUpdate(sale);

	}

	// Read All
	public List<Sale> getSales() {
		List<Sale> sales = this.hibernateTemplate.loadAll(Sale.class);
		return sales;
	}

	// Read Single
	@Transactional
	public Sale getSale(int pId) {
		Sale s = this.hibernateTemplate.get(Sale.class, pId);
		return s;
	}

	// Delete
	@Transactional
	public void deleteSale(int pId) {
		Sale s = this.hibernateTemplate.load(Sale.class, pId);
		this.hibernateTemplate.delete(s);
	}
	
	@Transactional
	public void deleteAll() {
		this.hibernateTemplate.deleteAll(getSales());
	}
	
}
