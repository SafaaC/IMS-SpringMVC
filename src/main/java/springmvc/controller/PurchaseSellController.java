package springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.model.Purchase;
import springmvc.model.Sale;
import springmvc.service.PurchaseService;
import springmvc.service.SaleService;

@org.springframework.stereotype.Controller
public class PurchaseSellController {
	@Autowired
	private PurchaseService purchaseServive;
	@Autowired
	private SaleService saleService;

	public SaleService getSaleService() {
		return saleService;
	}

	public void setSaleService(SaleService saleService) { 
		this.saleService = saleService;
	}

	public PurchaseService getPurchaseServive() {
		return purchaseServive;
	}

	public void setPurchaseServive(PurchaseService purchaseServive) {
		this.purchaseServive = purchaseServive;
	}
 
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/purchaseform")
	public String purchaseform() {
		return "purchases";
	}
	@RequestMapping("/saleinput")
	public String saleform() {
		return "saleCounter";
	}
	@RequestMapping(value = "/purchases", method = RequestMethod.POST)
	public String purchases(@ModelAttribute("purchase") Purchase purchase, Model model) {

		purchaseServive.createPurchase(purchase);
		model.addAttribute("mssg", "Purchase Successfull");
		return "success";
	}

	@RequestMapping(value = "/inventory"/* , method = RequestMethod.POST */ )
	public String inventory(Model m) {
		List<Purchase> purchases = purchaseServive.readPurchases();
		m.addAttribute("purchases", purchases);
		return "inventory";
	}

	// delete handler
	@RequestMapping(value = "/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest req) {
		this.purchaseServive.RemovePurchase(productId);
		RedirectView redirectView = new RedirectView();
		System.out.println(req.getContextPath());
		redirectView.setUrl(req.getContextPath() + "/inventory");
		return redirectView;
	}

	@RequestMapping(value = "/update/{productId}")
	public String update(@PathVariable("productId") int productId, Model m) {
		Purchase purchase = purchaseServive.readPurchase(productId);
		m.addAttribute("p", purchase);
		return "update_form";
	}

	// SALES HANDLERS
	@RequestMapping(value = "/sale"/* , method = RequestMethod.POST */ )
	public String sale(Model m) {
		List<Sale> sales = this. saleService.readSales();
		m.addAttribute("sales", sales);
		return "sale";
	}

	@RequestMapping(value = "/salesave", method = RequestMethod.POST)
	public String sales(@RequestParam("date") String date, @RequestParam("customerName") String customerName,
			@RequestParam("pId") int pId, @RequestParam("quantity") int quantity, Model model) {
		String productName = purchaseServive.getNameById(pId);
		double sellingRate = purchaseServive.getPriceById(pId);
		if(productName==null) {
			model.addAttribute("mssg", "No Product Found !!! please recheck the product id");
			return"error";
		}
		double amount = quantity * sellingRate;
		Sale s = new Sale(pId, date, customerName, productName, quantity, amount);
		model.addAttribute("sale", s);
		this.saleService.createSale(s);
		return "redirect:/sale";

	}

	@RequestMapping(value = "/deletesale/{pId}")
	public RedirectView deleteSale(@PathVariable("pId") int pId, HttpServletRequest req) {
		this.saleService.RemoveSale(pId);
		RedirectView redirectView = new RedirectView();
		System.out.println(req.getContextPath());
		redirectView.setUrl(req.getContextPath() + "/sale");
		return redirectView;
	}

	@RequestMapping(value = "/updatesale/{pId}")
	public String updateSale(@PathVariable("pId") int pId, Model m) {
		Sale sale=saleService.readSale(pId);
		m.addAttribute("s", sale);
		return "update_sale_form";
	}
	
	@RequestMapping(value="/saleinventory" )
	public String saleInventory(Model m) {
		List<Sale> sales  = saleService.readSales();
		List<Purchase> purchases = purchaseServive.readPurchases();
		int q = 0;
		for(Sale sale: sales) {
			int sPID=sale.getpId();
			int squantity=sale.getQuantity();
			for(Purchase purchase:purchases) {
				if(purchase.getProductId()==sPID) {
					if(squantity<purchase.getQuantity()) {
						q=purchase.getQuantity()-squantity;
						purchase.setQuantity(q);
						purchaseServive.createPurchase(purchase);
					}
					else {
						m.addAttribute("quantity", q);
						m.addAttribute("mss", "Sorry Quantity of the product is only");
						return "error";
					}
				}
			}
			
		}
		m.addAttribute("mssg", "Purshased products Successfully");
		saleService.RemoveAll();
		return "success";
	}
	@ExceptionHandler(Exception.class)
	public String exceptionHandler() {
		return "exception";
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
