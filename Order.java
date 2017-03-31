
public class Order {

	private int orderNumber;
	private Basket basket;
	private Person person;

	public Order(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void submitOrder(Basket basket, Person person){
		this.basket = basket;
		this.person = person;
	}

	public void showOrder() {
		person.showPerson();
		System.out.println("Zamowienie nr: " + orderNumber);
		basket.showBasket();
	}

}
