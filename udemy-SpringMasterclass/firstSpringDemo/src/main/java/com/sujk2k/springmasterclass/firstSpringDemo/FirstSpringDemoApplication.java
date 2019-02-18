package com.sujk2k.springmasterclass.firstSpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringDemoApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.bimarySearch(new int[]{1, 2, 3}, 3);
		System.out.println(result);

		//SpringApplication.run(FirstSpringDemoApplication.class, args);
	}
}