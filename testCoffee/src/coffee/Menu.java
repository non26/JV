package coffee;
import java.util.TreeMap; 

public class Menu {
	Latte latte;
	Capuccino capuccino;
	Mocha mocha;
	
	public Menu() {
		latte = new Latte();
		capuccino = new Capuccino();
		mocha = new Mocha();
	}
}

class Latte{
	TreeMap<String, String[]> component = new TreeMap<String, String[]>();
	public Latte() {
		component.put("Coffee", new String[] {"Espresso 1/3 cup"});
		component.put("Mix", new String[] {"Milk 2/3 cup"});
	}
}
class Capuccino{
	TreeMap<String, String[]> component = new TreeMap<String, String[]>();
	public Capuccino(){
		component.put("Coffee", new String[] {"Espresso 1/3 cup"});
		component.put("Mix", new String[] {"Milk 1/3 cup" , "Milk Foam 1/3 cup"});
	}
}
class Mocha{
	TreeMap<String, String[]> component = new TreeMap<String, String[]>();
	public Mocha() {
		component.put("Coffee", new String[] {"Espresso 1/3 cup"});
		component.put("Mix", new String[] {"Chocolate 1/3 cup" , "Milk 1/3 cup"});
	}
}