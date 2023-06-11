package springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Customer;
import springmvc.model.Sale;
import springmvc.model.Seller;
@Repository
public class CustomerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Create
	@Transactional
	public void saveOrUpdate(Customer customer) {
		this.hibernateTemplate.saveOrUpdate(customer);

	}

	// Read All
	public List<Customer> getCustomers() {
		List<Customer> customers = this.hibernateTemplate.loadAll(Customer.class);
		return customers;
	}

	// Read Single
	@Transactional
	public Customer getCustomer(int customerId) {
		Customer customer = this.hibernateTemplate.get(Customer.class, customerId);
		return customer;
	}

	// Delete
	@Transactional
	public void deleteCustomer(int customerId) {
		Customer customer = this.hibernateTemplate.load(Customer.class, customerId);
		this.hibernateTemplate.delete(customer);
	}
	// read by product name
		@Transactional
		public Customer getByName(String customerName) {
			List<Customer> customers = this.hibernateTemplate.loadAll(Customer.class);
			for (Customer customer : customers) {
				if (customer.getCustomerName().equalsIgnoreCase(customerName)) {
					return customer;
				}
			}
			return null;
		}
}
