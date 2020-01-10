package java8;

public class MethodReferences {
	
	MethodReferences(){
		System.out.println("References");
	}
	
	static void method12() {
		System.out.println("Test");
	}

	void method1() {
		System.out.println("Method");
	}
	
	public static void main(String[] args) {
		NoArgsVoidReturn noArgsVoidReturn = MethodReferences::method12;
		noArgsVoidReturn.method();
		NoArgsVoidReturn noArgsVoidReturn1 = new MethodReferences()::method1;
		noArgsVoidReturn1.method();
		NoArgsVoidReturn noArgsVoidReturn2 = MethodReferences::new;
		noArgsVoidReturn2.method();
	}
}