package java8;

@FunctionalInterface
public interface NoArgsVoidReturn {
	
	public void method();
	
	String toString();
	
	boolean equals(Object obj);
	
	int hashCode();
	
	default void test() {
		System.out.println("test");
	}
	
	static void method1() {
		System.out.println("method");
	}
	
}
