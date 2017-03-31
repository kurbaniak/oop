
public class Test {

	public static void main(String[] args) {

		Person person = new Person("Gucio");
		Order order = new Order(1);
		Basket basket = new Basket("koszyk_1");
		Product product = new Product("komputer");

		order.submitOrder(basket, person);
		basket.addProduct(product);

		order.showOrder();


	}

}
