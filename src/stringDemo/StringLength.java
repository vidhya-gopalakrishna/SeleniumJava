package stringDemo;

public class StringLength {

	public static void main(String[] args) {
		
		String str = "Welcome";
		char rev;
		int l;
		int i;
		int j;
		String temp = null;
		String temp1 = null;
		l=str.length();
		System.out.println("Length of the String "+l);
		System.out.println("Printing Characters ");
		for (i=0 ; i<l; i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("Reverse String");
		
		for (j=0; j<l; j++) {
			rev = str.charAt(j);
			temp = String.valueOf(rev);
			
			if (temp1==null){
				temp1 = temp;
			}
			else
			temp1 = temp.concat(temp1);
		}
		System.out.println(temp1);
	}

}
