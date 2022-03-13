package oopIntro2;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "JavaScript", "Engin Demiroğ");
		Product[] products = { product1 };
		for (Product product : products) {
			System.out.println(product1.name + "  " + product1.instructor);

		}

		ProductManager productManager = new ProductManager();
		productManager.add(product1);
		productManager.delete(product1);
	}
}
