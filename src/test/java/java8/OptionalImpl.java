package java8;

import java.util.Optional;

public class OptionalImpl {
	
	public static void main(String[] args) throws Exception {
		System.out.println("=====================");
		System.out.println("Empty");
		Optional<String> optional = Optional.empty();
		System.out.println(optional);
		System.out.println("=====================");
		System.out.println("of");
		Optional<String> optional1 = Optional.of("Sandeep");
		System.out.println(optional1);
		System.out.println("=====================");
		System.out.println("ofNullable");
		Optional<String> optional2 = Optional.ofNullable(null);
		System.out.println(optional2);
		System.out.println("=====================");
		System.out.println("isPresent");
		System.out.println(optional1.isPresent());
		System.out.println(optional2.isPresent());
		System.out.println("=====================");
		System.out.println("ifPresent");
		optional1.ifPresent(System.out::println);
		optional2.ifPresent(s->System.out.println(s));
		System.out.println("=====================");
		System.out.println("equals");
		System.out.println(optional2.equals(optional));
		System.out.println(optional2.equals(optional1));
		System.out.println("=====================");
		System.out.println("get");
		System.out.println(optional1.get());
		try {
		System.out.println(optional2.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(100);
		System.out.println("=====================");
		System.out.println("orElse");
		System.out.println(optional1.orElse("Nalla"));
		System.out.println(optional2.orElse("Nalla"));
		System.out.println("=====================");
		System.out.println("orElseGet");
		System.out.println(optional1.orElseGet(() -> "Uday"));
		System.out.println(optional2.orElseGet(() -> "Uday"));
		System.out.println("=====================");
		System.out.println("orElseThrow");
		System.out.println(optional1.orElseThrow(Exception::new));
		try {
		System.out.println(optional2.orElseThrow(Exception::new));
		} catch(Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(100);
		System.out.println("=====================");
		System.out.println("filter");
		System.out.println(optional1.filter(a -> a.equals("a")));
		System.out.println(optional1.filter(a -> a.equals("Sandeep")));
		System.out.println("=====================");
		System.out.println("map");
		System.out.println(optional1.map(a -> null));
		System.out.println(optional1.map(a -> a.equals("Sandeep")));
		System.out.println(optional1.map(a -> Optional.ofNullable(a.equals("Sandeep"))));
		System.out.println("=====================");
		System.out.println("flapmap");
		System.out.println(optional1.flatMap(a -> Optional.empty()));
		System.out.println(optional1.flatMap(a -> Optional.ofNullable(a.equals("Sandeep"))));
		System.out.println(optional1.flatMap(a -> Optional.ofNullable(Optional.ofNullable(a.equals("Sandeep")))));
	}
}
