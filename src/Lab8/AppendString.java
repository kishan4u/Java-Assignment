package Lab8;

public class AppendString {

	public static void main(String[] args) {
		String str1 = "String 1";
		String str2 = "String 2";


		StringBuffer sb = new StringBuffer(str1);

		System.out.println(sb.append(str2));

		StringBuilder sbr = new StringBuilder(str2);

		System.out.println(sbr.append(str1));

	}

}
