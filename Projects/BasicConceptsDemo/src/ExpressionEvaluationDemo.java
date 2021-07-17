public class ExpressionEvaluationDemo {
	public static void main(String[] args) {
		String str = "abc";

		int i = 10;
		int j = 20;
		int k = 30;

		System.out.println(i + j + str + k);// 30 + abc + 30
		System.out.println(str + i + j + k);// abc + 102030
		System.out.println(i + str + j + k);// 10 + abc + 2030
	}
}
