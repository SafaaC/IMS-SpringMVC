package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Sale {
	@Id
	private int pId;
	private String date;
	private String customerName;
	private String productName;
	private int quantity;
	private double amount;
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sale(int pid, String date, String customerName, String productName, int quantity, double amount) {
		super();
		this.pId = pid;
		this.date = date;
		this.customerName = customerName;
		this.productName = productName;
		this.quantity = quantity;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Sale [pid=" + pId + ", date=" + date + ", customerName=" + customerName + ", productName=" + productName
				+ ", quantity=" + quantity + ", amount=" + amount + "]";
	}
	
}
