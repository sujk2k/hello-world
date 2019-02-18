package com.sujk2k.springmasterclass.firstSpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// By below annotation, we tell spring framework that below is bean we want spring to manage
@Component
public class BinarySearchImpl {

    // By using autowired annotation, we tell spring that BinarySearchImpl requires sortAlgorithm to work
    @Autowired
    SortAlgorithm sortAlgorithm;

    public BinarySearchImpl (SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int bimarySearch(int[] arrayToSort, int numberToSearch){
        // Sort array
        int[] sortedNumbers = sortAlgorithm.sort(arrayToSort);
        System.out.println(sortAlgorithm);

        // Search array

        // Return result
        return 3;
    }
}
