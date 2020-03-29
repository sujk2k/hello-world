package com.sujk2k.springmasterclass.firstSpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringDemoApplication {
	// What we need to tell spring framework
	// 1. What beans are required for the application?
	// 2. What are dependencies for those beans?
	// 3. Where to search for beans (i.e. where to do component scan)
	// -- Spring automatically scan package and subpackage where it exists
	// e.g. here spring will automatically scan for all components
	// in "com.sujk2k.springmasterclass.firstSpringDemo" package
	// So no need to explicitly tell spring to do component scan in this case

	public static void main(String[] args) {

		// Comment out below since spring will create this bean for us now
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		// All beans are maintained in spring application context
		ApplicationContext applicationContext = SpringApplication.run(FirstSpringDemoApplication.class, args);

		// get binary search bean from application context
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		// call binarySearch instance method
		int result = binarySearch.binarySearch(new int[]{1, 2, 3}, 3);
		System.out.println(result);
	}
}