package com.liju;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class ConsoleRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("i love u liju");
	//	System.out.println(args[1]);
	//	System.out.println(Arrays.asList(args));

	}

}
