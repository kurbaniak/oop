
public class Basket {

	private String busketName;
	private Product product;


	public Basket(String busketName) {
		this.busketName = busketName;
	}

	public void addProduct(Product product) {
		this.product = product;
	}

	public void showBasket() {
		System.out.println("Koszyk: " + busketName);
		product.showProduct();
	}

}
