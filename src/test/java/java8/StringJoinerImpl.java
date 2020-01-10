package java8;

import java.util.StringJoiner;

public class StringJoinerImpl {
	public static void main(String[] args) {
		System.out.println("==========================");
		System.out.println("With delimiter");
		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add("Sandeep");
		stringJoiner.add("Ramesh");
		stringJoiner.add("Uday");
		System.out.println(stringJoiner);
		System.out.println("==========================");
		System.out.println("With delimiter, prefix & suffix");
		StringJoiner stringJoiner1 = new StringJoiner(":", "[", "]");
		stringJoiner1.add("Lavanya");
		stringJoiner1.add("Mahesh");
		stringJoiner1.add("Kashi");
		System.out.println(stringJoiner1);
		System.out.println("==========================");
		System.out.println("Merge StringJoiner, with  delimiter, prefix & suffix,"
				+ " with StringJoiner, with delimiter");
		stringJoiner1.merge(stringJoiner);
		System.out.println(stringJoiner1);
		System.out.println("==========================");
		System.out.println("Merge StringJoiner, with  delimiter,"
				+ " with StringJoiner, with delimiter, prefix & suffix");
		stringJoiner.merge(stringJoiner1);
		System.out.println(stringJoiner);
		System.out.println("==========================");
		System.out.println("length");
		System.out.println(stringJoiner.length());
		System.out.println("==========================");
		System.out.println("setEmptyValue for a empty String Joiner");
		StringJoiner stringJoiner2 = new StringJoiner(" - ");
		System.out.println(stringJoiner2.setEmptyValue("It's empty String"));
		System.out.println("==========================");
		System.out.println("setEmptyValue for a non-empty String Joiner");
		System.out.println(stringJoiner.setEmptyValue("It's empty String"));
		System.out.println("==========================");
		System.out.println("toString");
		System.out.println(stringJoiner1.toString());
	}

}
