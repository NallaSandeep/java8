package java8;

public class NoArgsVoidReturnImpl {

	public static void main(String[] args) {
		NoArgsVoidReturn noArgsVoidReturn = new NoArgsVoidReturn() {
			@Override
			public void method() {
				System.out.println("Test");
			}
		};
		noArgsVoidReturn.method();

		NoArgsVoidReturn noArgsVoidReturn1 = () -> {
			System.out.println("Method");
		};
		noArgsVoidReturn1.method();

	}

}
