package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.CustomerDao;
import springmvc.model.Customer;
import springmvc.model.Purchase;

@Service
public class CustomerServive {
	@Autowired
	private CustomerDao customerDao;

	public Customer getCustomer(int customerId) {
		return this.customerDao.getCustomer(customerId);
	}

	public void createCustomer(Customer customer) {

		this.customerDao.saveOrUpdate(customer);
	}

	public List<Customer> readCustomers() {

		return this.customerDao.getCustomers();
	}

	public Customer readCustomer(int customerId) {

		return this.customerDao.getCustomer(customerId);

	}
	public Customer getByName(String customerName) {
		return this.customerDao.getByName(customerName);
	}

	public void RemoveCustomer(int customerId) {

		this.customerDao.deleteCustomer(customerId);
	}
}
