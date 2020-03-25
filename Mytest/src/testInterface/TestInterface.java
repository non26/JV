package testInterface;

interface beInterface{
		public void calling();
		public int getValue();
	}
class implementInterface implements beInterface{
	int xAttr;
	public implementInterface() {
		xAttr=0;
	}

	@Override
	public void calling() {
		System.out.println("Hello");
	}

	@Override
	public int getValue() {
		int x = 6;
		return x;
	}
	void message() {
		System.out.println("Chanon");
	}
}
public class TestInterface {
	public static void main(String[] args) {
		beInterface forTest1 = new implementInterface(); // forTest1 is type of test but use new defined method in 'forTest'
		forTest1.calling(); // use new defined method of calling 
		System.out.println(forTest1.getValue());
		// fortest1 cann't call the message method cause it belongs to the forTest method but forTest1 is type of 'test'
		System.out.println(forTest1.getClass().getName());
		
		implementInterface forTest2 = new implementInterface();
		int objAttr = forTest2.xAttr;
		forTest2.calling();
		forTest2.getValue();
	}
}