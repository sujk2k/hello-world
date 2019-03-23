package com.sujk2k.springmasterclass.firstSpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// By below annotation, we tell spring framework that below is bean we want spring to manage
@Component
public class BinarySearchImpl {

    // By using auto-wired annotation, we tell spring that BinarySearchImpl requires sortAlgorithm to work
    // Injection happens even if no setter or constructor injection is explicitly specified

    // Example of auto-wiring by Name instead of autowiring by Type since @Primary tag is now removed from one of the
    // component
    @Autowired
    @Qualifier("bubble")
    SortAlgorithm sortAlgorithm;

    // Setter injection
    /*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    // Constructor injection
    // Use constructor injection, then use constructor injection (before spring boot)
    // spring.debug.log -> Autowiring by type from bean name 'binarySearchImpl' via constructor to bean named 'quickSortAlgorithm'
    /*public BinarySearchImpl (SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm = sortAlgorithm;
    }*/

    public int binarySearch(int[] arrayToSort, int numberToSearch){
        // Sort array
        int[] sortedNumbers = sortAlgorithm.sort(arrayToSort);
        System.out.println(sortAlgorithm);

        // Search array

        // Return result
        return 3;
    }
}