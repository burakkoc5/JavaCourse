package oopIntro;

public class Product {
	
	private int id;
	private int categoryId;
	private String name;
	private String detail;
	private double unitPrice;
	
public Product() {
		
	}
	public Product(int id,int categoryId,String name,double unitPrice,String detail,double discount,double unitPriceAfterDiscount) {
		super();
		this.id=id;
		this.categoryId=categoryId;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		this.discount=discount;
		this.unitPriceAfterDiscount=unitPriceAfterDiscount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return unitPriceAfterDiscount;
	}
	double discount;
	double unitPriceAfterDiscount;
	
	
	
	 
	
	

}
