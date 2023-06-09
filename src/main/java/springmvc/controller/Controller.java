package springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.model.Purchase;
import springmvc.service.PurchaseService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private PurchaseService purchaseServive;
	
	public PurchaseService getPurchaseServive() {
		return purchaseServive;
	}

	public void setPurchaseServive(PurchaseService purchaseServive) {
		this.purchaseServive = purchaseServive;
	}

	@RequestMapping("/")
	public String home() {
		return "purchases";
	}
	
	@RequestMapping(value = "/purchases" , method = RequestMethod.POST)
	public String purchases(@ModelAttribute("purchase") Purchase purchase,Model model) {
		
		purchaseServive.createPurchase(purchase);
		model.addAttribute("mssg","Purchase Successfull");
		return "success";
	}

	@RequestMapping(value = "/inventory"/* , method = RequestMethod.POST */ )
	public String inventory(Model m) {
		List<Purchase> purchases= purchaseServive.readPurchases();
		m.addAttribute("purchases",purchases);
		return "inventory";
	}
	
	//delete handler
	@RequestMapping(value = "/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId  ,HttpServletRequest req) {
		this.purchaseServive.RemovePurchase(productId);
		RedirectView redirectView=new RedirectView();
		System.out.println(req.getContextPath());
		redirectView.setUrl(req.getContextPath()+"/inventory");
		return redirectView;
	}
	@RequestMapping(value = "/update/{productId}" )
	public String update(@PathVariable("productId") int productId ,Model m) {
		Purchase purchase=purchaseServive.readPurchase(productId);
		m.addAttribute("p", purchase);
		return "update_form";
	}
	/*
	 * @RequestMapping(value = "/customer" , method = RequestMethod.POST) public
	 * String purchases(@ModelAttribute("customer") Customer customer,Model model) {
	 * model.addAttribute("mssg","Customer Details Added Succesffully"); //hibernate
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/seller" , method = RequestMethod.POST) public
	 * String purchases(@ModelAttribute("seller") Seller seller,Model model) {
	 * model.addAttribute("mssg","Seller Details Added Succesffully"); //hibernate
	 * return "success"; }
	 */
	
}
