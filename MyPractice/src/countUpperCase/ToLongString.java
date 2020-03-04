package countUpperCase;
import java.util.Arrays;
/*
  this class is used to create the long string without spaces separated the words 
 */
public class ToLongString {
	String[] longString;
	public ToLongString(String x) {
		this.longString = x.split(" ");
		
	}
	public void showStringArray() {
		System.out.println(Arrays.toString(this.longString));
	}
	public String longUpperString() {
		String keep = "" ;
		String firstUpperString;
		for (String x : this.longString){
			firstUpperString = x.substring(0, 1).toUpperCase() + x.substring(1, x.length());
			keep = keep.concat(firstUpperString);
//			System.out.println(x.substring(0, 1).toUpperCase() + x.substring(1, x.length()));
		}
		return keep;
	}
	public static String firstUpperCase(String x){
		String first = x.substring(0, 1).toUpperCase();
		String theRest = x.substring(1, x.length());
		x = first + theRest;
		return x;
	}
	public static void main(String[] args) {
		ToLongString test = new ToLongString("this class is used to create the long string without spaces separated the words ");
		System.out.println(test.longUpperString());
		// test static method
		String x = ToLongString.firstUpperCase("this class is used to create the long string without spaces separated the words ");
		System.out.println(x);
	}
	
	
	

}
