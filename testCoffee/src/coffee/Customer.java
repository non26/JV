package coffee;

public class Customer {
	public static void main(String[] args) {
		CoffeeShop customerCoffee = new CoffeeShop();
		customerCoffee.orderBeverage("latte");
		System.out.println();
		customerCoffee.orderBeverage("capuccino");
		System.out.println();
		customerCoffee.orderBeverage("mocha");
	}
}
