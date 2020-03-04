package FindAscii
;


public class FindAsciiValue {
	char literal;
	int intAscii;
	public FindAsciiValue(char x) {
		this.literal = x;
		this.intAscii = (int) x;
		}	
	
	public void showAscii() {
		System.out.println(this.intAscii);
	}
	public int returnAscii() {
		return intAscii;
	}
	public static void main(String[] args) {
		FindAsciiValue testAsciiValue = new FindAsciiValue('A');
		testAsciiValue.showAscii(); // test method
		System.out.println(testAsciiValue.returnAscii()); // test return Ascii
	}

}
