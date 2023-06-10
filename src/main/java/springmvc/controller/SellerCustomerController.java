package springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.model.Customer;
import springmvc.model.Seller;
import springmvc.service.CustomerServive;
import springmvc.service.SellerService;

@Controller
public class SellerCustomerController {
	@Autowired
	private CustomerServive customerService;

	public CustomerServive getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerServive customerService) {
		this.customerService = customerService;
	}

	@Autowired
	private SellerService sellerService;

	public SellerService getSellerService() {
		return sellerService;
	}

	public void setSellerService(SellerService sellerService) {
		this.sellerService = sellerService;
	}
	//Mapping To customer form
	@RequestMapping("/customerinput")
	public String customerform() {
		return "customer";
	}

	//mapping to seller form
	@RequestMapping("/sellerinput")
	public String sellerform() {
		return "seller";
	}
	
	//mapping after add customer in form
	@RequestMapping(value = "/customer")
	public String customer(@ModelAttribute("customer") Customer customer, Model model) {
		customerService.createCustomer(customer);
		model.addAttribute("mssg", "Customer Added Successfull");
		return "success";
	}
	//mapping to all customers details
	@RequestMapping(value = "/customers"/* , method = RequestMethod.POST */ )
	public String customers(Model m) {
		List<Customer> customers = customerService.readCustomers();
		m.addAttribute("customers", customers);
		return "customers";
	}

	// delete handler for customer
	@RequestMapping(value = "/cusdelete/{customerId}")
	public RedirectView deleteCustomer(@PathVariable("customerId") int customerId, HttpServletRequest req) {
		this.customerService.RemoveCustomer(customerId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(req.getContextPath() + "/customers");
		return redirectView;
	}
	
	//upadte handler for customers
	@RequestMapping(value = "/cusupdate/{customerId}")
	public String updateCustomer(@PathVariable("customerId") int customerId, Model m) {
		Customer customer = this.customerService.getCustomer(customerId);
		m.addAttribute("c", customer);
		return "update_customer_form";
	}
	
	//mapping to search customer
	@RequestMapping(value = "/searchcustomer")
	public String searchCustomer(Model m, HttpServletRequest request) {

		String search = (String) request.getParameter("search");
		Customer customer = customerService.getByName(search);
		if (customer == null) {

			Customer customeri = customerService.getByName(search);
			if (customeri == null) {
				return "notfound";
			} else {
				m.addAttribute("search", customeri);
				return "result";
			}
		}

		m.addAttribute("search", customer);
		return "result";

	}

	//mapping after add seller form
	@RequestMapping(value = "/seller")
	public String seller(@ModelAttribute("seller") Seller seller, Model model) {
		sellerService.createSeller(seller);
		model.addAttribute("mssg", "Customer Added Successfull");
		return "success";
	}
	
	//mapping to all cutomer details
	@RequestMapping(value = "/sellers"/* , method = RequestMethod.POST */ )
	public String sellers(Model m) {
		List<Seller> sellers = sellerService.readSellers();
		m.addAttribute("sellers", sellers);
		return "sellers";
	}

	// delete handler for seller
	@RequestMapping(value = "/sellerdelete/{sellerId}")
	public RedirectView deleteSeller(@PathVariable("sellerId") int sellerId, HttpServletRequest req) {
		this.sellerService.RemoveSeller(sellerId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(req.getContextPath() + "/sellers");
		return redirectView;
	}
	
	//update handler for seller
	@RequestMapping(value = "/sellerupdate/{sellerId}")
	public String updateSeller(@PathVariable("sellerId") int sellerId, Model m) {
		Seller seller = this.sellerService.getSeller(sellerId);
		m.addAttribute("s", seller);
		return "update_seller_form";
	}

	//search handler for seller
	@RequestMapping(value = "/searchseller")
	public String searchSeller(Model m, HttpServletRequest request) {

		String search = (String) request.getParameter("search");
		Seller seller = sellerService.getByName(search);
		if (seller == null) {

			Seller selleri = sellerService.getByName(search);
			if (selleri == null) {
				return "notfound";
			} else {
				m.addAttribute("search", selleri);
				return "result";
			}
		}

		m.addAttribute("search", seller);
		return "result";

	}

	//exception handler
		@ExceptionHandler(Exception.class)
		public String exceptionHandler() {
			return "exception";
		}
}
