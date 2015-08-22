package org.sandboxx.test2;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * This class contains Java 8 code
 */
public class Test2Java8 {
	public static void main(String[] args) {
		String[] words = {"Java", "8", "world"};
		String message = Arrays.asList(words).stream().collect(Collectors.joining(" ", "Hello, ", "!"));
		System.out.println(message); 
	}
}
