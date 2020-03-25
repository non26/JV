package inheritance;

class toExtend{
	int xExtend;
	String yExtend;
	public toExtend(String name){
		this.xExtend = 3;
		this.yExtend = name;
	}
	void toExtendCalling() {
		System.out.print("Calling from toExtend");
	}
	String toGetValue(String name) {
		return "Hello" + name;
	}
	int toGetValue() {
		return 2;
	}
}

class toDerived extends toExtend{
	int xDerived;
	String yDerived;
	public toDerived() {
		super("Chanon");
		xDerived = 3;
		yDerived = "Eiemrod";
	}
	@Override
	void toExtendCalling() {
		System.out.print("Calling from toDerived");
	}
	@Override
	String toGetValue(String name) {
		return "Hello" + name;
	}
}

public class testinheritance {
	public static void main(String[] args) {
		toExtend forToExtend = new toDerived();
		System.out.println(forToExtend.getClass().getName());
		int x = forToExtend.xExtend;
		String y = forToExtend.yExtend;
		
		toDerived forToDerived = new toDerived();
		System.out.println(forToDerived.yExtend+" "+forToDerived.yDerived);
	}
}