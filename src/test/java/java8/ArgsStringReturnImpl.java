package java8;

public class ArgsStringReturnImpl {

	public static void main(String[] args) {
		ArgsStringReturn argsStringReturn = new ArgsStringReturn() {
			@Override
			public String method(String s1, String s2) {
				return s1 + ", " + s2;
			}
		};
		System.out.println(argsStringReturn.method("Sandeep", "Nalla"));

		ArgsStringReturn argsStringReturn1 = (s1, s2) -> s2 + ", " + s1;
		System.out.println(argsStringReturn1.method("Sandeep", "Nalla"));

	}

}
