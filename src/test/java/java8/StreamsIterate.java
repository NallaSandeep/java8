package java8;

import java.util.stream.Stream;

public class StreamsIterate {

	public static void main(String[] args) {
		Stream.iterate(1, i -> i + 1).filter(i -> i % 19 == 0).limit(10).forEach(System.out::println);
	}
}
