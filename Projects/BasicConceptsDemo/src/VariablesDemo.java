import java.util.Locale;

public class VariablesDemo {

	public static void main(String[] args) {
		byte b = 65;
		short s = 32;
		int i = 10;
		long l = 93923;
		float f = 20.54f;
		double d = 23023920;
		char c = 'x';
		boolean isSet = false;
		String str = "Milkyway";

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(isSet);
		System.out.println(str);

		String somestr = "Hello Tesla";
		String[] split = somestr.split(" ");
		for (String extract : split) {
			System.out.println(extract);
		}
		
		System.out.println(somestr.length());
		
		StringBuffer sb = new StringBuffer("Andromeda");
		System.out.println(sb.reverse().toString().toUpperCase());
	}

}
