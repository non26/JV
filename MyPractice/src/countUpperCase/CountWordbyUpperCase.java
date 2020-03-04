package countUpperCase;

/* 
 * given the long string look like this: findTheWordByUpperCase
   and count the number of words in  that  string 
 */
public class CountWordbyUpperCase {
	String longString;
	public CountWordbyUpperCase(String x) {
		this.longString = x;
	}
	public int countWord() {
		int AValue = (int) 'A';
		int ZValue = (int) 'Z';
		int totalwords = 0;
		for(int i=AValue; i<=ZValue; i++) {
			int result = 0;
			int end = -1;
			while(true) {
				char asciiString = (char) i;
				result = longString.indexOf(asciiString, end+1);
				if(result != -1) {
					end = result;
					totalwords ++;
					continue;
				}else {
					break;
				}
			}
		}
		return totalwords;
	}
	public static void main(String[] args) {
		CountWordbyUpperCase testCase = new CountWordbyUpperCase("ThisClassIsUsedToCreateTheLongStringWithoutSpacesSeparatedTheWords");
		System.out.println(testCase.countWord());
	}
}
