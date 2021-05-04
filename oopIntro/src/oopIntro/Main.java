package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Dizüstü Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Akýllý Telefon");
		
		Product product1 = new Product(1,1,"Lenovo V14",6000,"16Gb Ram intel i5",10,5400);
		
		Product product2 = new Product(2,1,"Lenovo V15",8000,"16GB Ram Intel i5",10,7200);
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setCategoryId(1);
		product3.setUnitPrice(10000);
		product3.setName("Hp 15");
		product3.setDiscount(0);
		product3.setDetail("8GB Ram Intel Core i7");
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		Product[] products = {product1,product2,product3};
				
		for(Product product : products) {
			System.out.println(product.getName()+": "+product.getUnitPrice()+"TL");
		};

	}

}
