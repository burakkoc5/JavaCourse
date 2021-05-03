package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Dizüstü Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Akýllý Telefon";
		
		Product product1 = new Product(1,1,"Lenovo V14",6000,"16Gb Ram intel i5");
		
		Product product2 = new Product();
		product2.id=2;
		product2.categoryId=1;
		product2.name="Lenovo V15";
		product2.unitPrice=8000;
		product2.detail="16GB Ram Intel i5";
		
		Product product3 = new Product();
		product3.id=3;
		product3.categoryId=1;
		product3.name="Hp 15";
		product3.unitPrice=5000;
		product3.detail="8GB Ram Intel i3";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		Product[] products = {product1,product2,product3};
				
		for(Product product : products) {
			System.out.println(product.name+": "+product.unitPrice+"TL");
		};

	}

}
