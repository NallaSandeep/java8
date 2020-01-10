package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterImpl {

	public class Employee {
		int id;
		String name;
		int age;

		public Employee(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}
	}

	public static void main(String[] args) {
		FilterImpl filterImpl = new FilterImpl();
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(filterImpl.new Employee(100, "Akhil", 22));
		employees.add(filterImpl.new Employee(22, "Sandeep", 28));
		employees.add(filterImpl.new Employee(45, "Ramesh", 25));
		employees.add(filterImpl.new Employee(35, "Uday", 29));
		Consumer<Employee> print = a -> System.out.println(a.id + " - " + a.name + " - " + a.age);
		System.out.println("Before Filtering:");
		employees.forEach(print);
		System.out.println("=========================");
		System.out.println("Above age 25:");
		Stream<Employee> above = employees.stream().filter(a -> a.age > 25);
		above.forEach(print);
		System.out.println("=========================");
		System.out.println("Above ID 40:");
		Stream<Employee> below = employees.stream().filter(a -> a.id > 40);
		below.forEach(print);
		System.out.println("=========================");
		System.out.println("Names - Below age 25:");
		List<String> names = employees.stream().filter(a -> a.age <= 25).map(a -> a.name).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println("=========================");
		System.out.println("Names - Below age 25 - Without Streams:");
		List<String> namesWithout = new ArrayList<String>();
		for(Employee e: employees) {
			if (e.age <= 25) {
				namesWithout.add(e.name);
			}
		}
		for (String name: namesWithout) {
			System.out.println(name);
		}
		System.out.println("=========================");
		System.out.println("Reduce - Above age 23 & Below age 29:");
		System.out.println(employees.stream().filter(a->a.age > 23 && a.age < 29).map(a->a.age).reduce(0, (sum, age) -> sum + age));
		System.out.println("=========================");
		System.out.println("Averaging by Collectors method - By id:");
		System.out.println((double) employees.stream().collect(Collectors.averagingInt(a->a.id)));
		System.out.println("=========================");
		System.out.println("Max - By age:");
		System.out.println(employees.stream().max((a, b) -> a.age > b.age? 1:-1).get().name);
		System.out.println("=========================");
		System.out.println("Min - By age:");
		System.out.println(employees.stream().min((a, b) -> a.age > b.age? 1:-1).get().name);
	}
}