package oopIntro;

public class Product {
	
	int id;
	int categoryId;
	String name;
	String detail;
	double unitPrice;
	
	public Product() {
		System.out.println("Oluþturuldu");
	}
	public Product(int id,int categoryId,String name,double unitPrice,String detail) {
		this.id=id;
		this.categoryId=categoryId;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	 
	
	

}
