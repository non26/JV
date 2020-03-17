package coffee;

public class CoffeeShop extends Procedure {
	Menu menu;
	public CoffeeShop() {
		menu = new Menu();
	}
	void orderBeverage(String type) {
		switch (type.toLowerCase()){
		case "latte":
			System.out.println(type.toUpperCase());
			prepareRecipe(menu.latte.component);
			boilWater();
			brewCoffee();
			pourInCap();
			break;
		case "capuccino":
			System.out.println(type.toUpperCase());
			prepareRecipe(menu.capuccino.component);
			boilWater();
			brewCoffee();
			pourInCap();
			break;
		case "mocha":
			System.out.println(type.toUpperCase());
			prepareRecipe(menu.mocha.component);
			boilWater();
			brewCoffee();
			pourInCap();
			break;
		}
	}
	
}

