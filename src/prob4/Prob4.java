package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str){
		if(str == null) return null;
		
		char[] tmp = str.toCharArray();
		char[] result = new char[str.length()];
		
		for(int i = 0 ; i < result.length; i++){
			result[i] = tmp[tmp.length-i-1];
		}
		
		return result;
	}
	
	public static void printCharArray(char[] array){
		for(char c : array){
			System.out.print(c);
		}
		System.out.println("");
	}
}
