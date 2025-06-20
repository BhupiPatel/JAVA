package strings;

public class CountAlphabetsNumbers {

	public static void main(String[] args) {
		String str = "Bhupi123@QA45!";
		int l=str.length()-1;
		int al=0,no=0;
		while (l>=0) {
			if (str.charAt(l)>='a'&&str.charAt(l)<='z'||str.charAt(l)>='A'&&str.charAt(l)<='Z') {
				al++;
			}else if (str.charAt(l)>='0'&&str.charAt(l)<='9') {
				no++;
			}
			l--;
		}
		System.out.println(al+" "+no);
	}

}
